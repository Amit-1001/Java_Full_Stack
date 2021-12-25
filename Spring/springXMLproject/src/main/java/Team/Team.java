package Team;

import Project.Project;

import java.util.ArrayList;

public class Team implements teamData{
    private String TeamName;
    private String TeamMember;
    private Project projectList;






    public Team (Project projectList){
        this.projectList = projectList;
    }

    public void setTeamName(String teamName) { // this is assigned using teams.properties
        TeamName = teamName;
    }

    public void setTeamMember(String teamMember) {
        TeamMember = teamMember;
    }

    @Override
    public String teamName() {
        return TeamName;
    }

    @Override
    public String teamMember() {
        return TeamMember;
    }

    @Override
    public void setProject() {

    }

    @Override
    public void showProjects() {

    }


}
