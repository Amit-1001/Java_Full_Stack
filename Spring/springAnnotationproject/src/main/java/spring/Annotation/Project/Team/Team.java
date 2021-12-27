package spring.Annotation.Project.Team;

import spring.Annotation.Project.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@Qualifier("teamInfo")
public class Team implements teamInfo{

    @Autowired
    Project project;

    @Value("${teamName}")
    String teamName;

    @Value("${teamMember}")
    String teamMember;


    public Project getProject() {
        return project;
    }


    public String getTeamName() {
        return teamName;
    }

    public String getTeamMember() {
        return teamMember;
    }




    @Override
    public List<String> setProject(List<String> list) {
        return project.setProjects(list);
    }
}
