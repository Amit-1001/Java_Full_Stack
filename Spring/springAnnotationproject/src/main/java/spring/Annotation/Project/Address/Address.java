package spring.Annotation.Project.Address;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("addressInfo")
public class Address implements addressData{

    private String AddressLine1;
    private String AddressLine2;
    private String City;
    private String State;
    private String PinCode;


    @Override
    public String AddressLine1(String addressLine1) {
        return AddressLine1 = addressLine1;
    }

    @Override
    public String AddressLine2(String addressLine2) {
        return AddressLine2 = addressLine2;
    }

    @Override
    public String City(String city) {
        return City = city;
    }

    @Override
    public String State(String state) {
        return State = state;
    }

    @Override
    public String PinCode(String pinCode) {
        return PinCode = pinCode;
    }

    public String getAddressLine1() {
        return AddressLine1;
    }

    public String getAddressLine2() {
        return AddressLine2;
    }

    public String getCity() {
        return City;
    }

    public String getState() {
        return State;
    }

    public String getPinCode() {
        return PinCode;
    }
}
