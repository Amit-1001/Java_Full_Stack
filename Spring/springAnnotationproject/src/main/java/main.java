import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.Annotation.Project.user.User;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        User employee = context.getBean("UserInfo",User.class);

        List<String> projects = new ArrayList<>();

        projects.add("Jupiter visit");
        projects.add("Destroy ElonMusk");

        employee.setName("Amit");
        employee.setPhone("83123123");
        employee.setAddressLine1("This is Address Line 1");
        employee.setAddressLine2("This is Address Line 2");
        employee.setCity("Mars");
        employee.setState("Universe");
        employee.setPinCode("1.2.3.4");
        employee.setProjects(projects);

        employee.displayInformation();

    }
}
