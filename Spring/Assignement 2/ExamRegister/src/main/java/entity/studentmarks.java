package entity;

import javax.persistence.*;

@Entity
@Table(name = "studentmarks")
public class studentmarks {

    // all variable name should be same as database's variable name

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // this because we have created auto increment for this id
    @Column(name = "ID") // this column is primary key // ID is always capital
    private Integer id; // this data member is corresponds to primary key of table

    @Column(name = "rollNo")
    private String rollNo;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "semester")
    private String semester;

    @Column(name = "percentage")
    private Integer percentage;

    public studentmarks() {
    }
    public studentmarks(String rollNo, String firstName, String lastName, String semester, Integer percentage) {
        this.rollNo = rollNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.semester = semester;
        this.percentage = percentage;
    }

    public Integer getId() {
        return id;
    }

    public String getRollNo() {
        return rollNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSemester() {
        return semester;
    }

    public Integer getPercentage() {
        return percentage;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public void setPercentage(Integer percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "studentmarks{" +
                "id=" + id +
                ", rollNo='" + rollNo + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", semester='" + semester + '\'' +
                ", percentage=" + percentage +
                '}';
    }
}
