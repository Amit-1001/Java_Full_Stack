package spring.Annotation.Project;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class Project {
    List<String> projectList = new ArrayList<>();

    public List<String> setProjects(List<String> list){
        return projectList = list;
    }

    @Override
    public String toString() { // when Project object is returned it will invoke toString method
        return "projectList=" + projectList ;
    }
}
