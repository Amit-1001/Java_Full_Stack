package spring.Annotation.Project.user;

import spring.Annotation.Project.Address.Address;
import spring.Annotation.Project.Team.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("UserInfo")
public class User implements userData{

     @Autowired
     @Qualifier("addressInfo")
     Address address;

     @Autowired
     @Qualifier("teamInfo")
     Team teamInfo;

     String Name;
     String Phone;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }



    @Override
    public String name() {
        return Name;
    }

    @Override
    public String Phone() {
        return Phone;
    }

    @Override
    public List<String> setProjects(List<String> list) {
        return teamInfo.setProject(list);
    }

    @Override
    public void displayInformation() {
        System.out.println("Name of employee:"+name());
        System.out.println("Phone no:"+Phone());
        System.out.println("Address line 1:"+address.getAddressLine1());
        System.out.println("Address line 2:"+address.getAddressLine2());
        System.out.println("Pin Code:"+address.getPinCode());
        System.out.println("City:"+address.getCity());
        System.out.println("State:"+address.getState());

        System.out.println("--------------------------------");
        System.out.println("Team Name:"+teamInfo.getTeamName());
        System.out.println("Team Members:"+teamInfo.getTeamMember());
        System.out.println("Team "+teamInfo.getProject());
    }

    public void setAddressLine1(String line1){
        address.AddressLine1(line1);
    }
    public void setAddressLine2(String line2){
        address.AddressLine2(line2);
    }
    public void setCity(String city){
        address.City(city);
    }
    public void setState(String state){
        address.State(state);
    }
    public void setPinCode(String pinCode){
        address.PinCode(pinCode);
    }


}
