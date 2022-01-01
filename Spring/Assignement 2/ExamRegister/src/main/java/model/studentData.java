package model;

import com.google.protobuf.Message;
import org.springframework.beans.Mergeable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.HashMap;


public class studentData {

    @NotNull
    @Pattern(regexp = "EDY[0-9]{3}$", message =  "Enter valid roll no:EDY101")
    private String rollNo;

    @NotNull
    @Size(min = 1, message = "Enter last name")
    private String lastName;

    @NotNull
    @Pattern(regexp = "^[1-8]" ,message = "Enter valid Semester between 1 to 8")
    private String semester;

    private String firstName;

    private String english;
    private String math;
    private String chemistry;
    private String biology;
    private String physics;

    private Integer percentage;

    public void setEnglish(String english) {
        this.english = english;
    }

    public void setMath(String math) {
        this.math = math;
    }

    public void setChemistry(String chemistry) {
        this.chemistry = chemistry;
    }

    public void setBiology(String biology) {
        this.biology = biology;
    }

    public void setPhysics(String physics) {
        this.physics = physics;
    }



    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }



    public String getEnglish() {
        return english;
    }

    public String getMath() {
        return math;
    }

    public String getChemistry() {
        return chemistry;
    }

    public String getBiology() {
        return biology;
    }

    public String getPhysics() {
        return physics;
    }


    public Integer percentage(){

        percentage = (Integer.parseInt(getPhysics()) +Integer.parseInt(getChemistry())
                +Integer.parseInt(getMath())+Integer.parseInt(getBiology())+Integer.parseInt(getEnglish()))*100/500;

        return percentage;
    }


}
