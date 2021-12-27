package spring.Annotation.Project.user;

import org.springframework.stereotype.Component;

import java.util.List;


public interface userData {
    String name();
    String Phone();

    void displayInformation();

    List<String> setProjects(List<String> list);
}
