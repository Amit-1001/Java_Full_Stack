package Controller;


import com.oracle.wls.shaded.org.apache.xpath.operations.Mod;


import entity.studentmarks;
import model.studentData;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping("/home")
    public String home(){
        return "homePage";
    }

    @RequestMapping("/insertMarks")
    public String insertMarks(Model model){
        model.addAttribute("data",new studentData());

        return "insertMarks";
    }

    @RequestMapping("/store")
    public String store(@Valid @ModelAttribute("data") studentData data,BindingResult bindingResult,Model model){
        if(bindingResult.hasErrors()){
            return "insertMarks";
        }

            String rollNo = data.getRollNo();
            String firstName = data.getFirstName();
            String lastName = data.getLastName();
            String semester = data.getSemester();
            Integer percentage = data.percentage();



            SessionFactory sessionFactory = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .addAnnotatedClass(studentmarks.class)
                    .buildSessionFactory();

            Session session = sessionFactory.getCurrentSession();

            try {
                studentmarks student = new studentmarks(rollNo,firstName,lastName,semester,percentage);
                session.beginTransaction();

                session.save(student);

                session.getTransaction().commit();

            }catch (Exception e){
                    session.getTransaction().rollback();
                    e.printStackTrace();
            }
            finally {
                session.close();
                sessionFactory.close();
                return "success";
            }





    }
    @RequestMapping("/displayMarks")
    public String displayMarks(HttpServletRequest request, Model model){

        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(studentmarks.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        try {
            session.beginTransaction();

            List<studentmarks> studentmarksList = session.createQuery("from studentmarks s  order by s.percentage DESC").list();

                model.addAttribute(studentmarksList);
            //request.setAttribute("studentMarks",studentmarksList);

            List<studentmarks> res = new ArrayList<>();

            for (studentmarks student : studentmarksList){
                res.add(student);

            }

            for (studentmarks student: res){
                System.out.println(student);
            }


           // model.addAttribute(res);





            session.getTransaction().commit();
        }catch (Exception e){
            session.getTransaction().rollback();
            e.printStackTrace();
        }
        finally {
            session.close();
            sessionFactory.close();

        }
        return "displayMarks";

    }

    private ArrayList<studentmarks> covert(List<studentmarks> studentmarksList) {

                ArrayList<studentmarks> res = new ArrayList<>();
                for(studentmarks student: studentmarksList){
                    res.add(student);
                }
                return res;
    }


}
