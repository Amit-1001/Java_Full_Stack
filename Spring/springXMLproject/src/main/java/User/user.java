package User;

import Address.Address;
import Team.Team;

import java.util.ArrayList;
import java.util.List;

public class user implements userData{

    Address address;

    // teamInfo is assigned using setter injection
    Team teamInfo; // generate setter

    List<String> list = new ArrayList<>();


    public void setList(List<String> list) { // Assigning value to Project list of tema
        teamInfo.setProject(list);
    }

    public user(Address address){
        this.address = address;
    }

    public void setTeamInfo(Team teamInfo) {
        this.teamInfo = teamInfo;
    }

    private String Name;
    private String Phone;
    @Override
    public String getName(String name) {
        return this.Name = name;
    }

    @Override
    public String getPhone(String phone) {
        return this.Phone = phone;
    }

    @Override
    public void displayInformation(){
        System.out.println("Name of employee:"+Name);
        System.out.println("Phone no:"+Phone);
        System.out.println("Address line 1:"+address.getAddressLine1());
        System.out.println("Address line 2:"+address.getAddressLine2());
        System.out.println("Pin Code:"+address.getPinCode());
        System.out.println("City:"+address.getCity());
        System.out.println("State:"+address.getState());

        System.out.println("--------------------------------");
        System.out.println("Team Name:"+teamInfo.teamName());
        System.out.println("Team Members:"+teamInfo.teamMember());
        System.out.println("Team project:");
        teamInfo.showProjects();
    }

    public void setAddressLine1(String addressLine1) {
        address.Address_Line1(addressLine1);
    }

    public void setAddressLine2(String addressLine2) {
       address.Address_Line2(addressLine2);
    }

    public void setCity(String city) {
        address.City(city);
    }

    public void setState(String state) {
        address.State(state);
    }

    public void setPinCode(String pinCode) {
        address.PinCode(pinCode);
    }







}
