import Address.Address;
import User.user;
import User.userData;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        user employee =  context.getBean("employee",user.class);
        ArrayList<String> project = new ArrayList<String>();
        project.add("Mission impossible");
        project.add("Moon visit");

        employee.getName("Amit");
        employee.getPhone("893388282");
        employee.setAddressLine1("No where");
        employee.setAddressLine2("Mars");
        employee.setPinCode("1231283");
        employee.setCity("Wakanda");
        employee.setState("Avenger");
        employee.setList(project);


        employee.displayInformation();





    }
}
