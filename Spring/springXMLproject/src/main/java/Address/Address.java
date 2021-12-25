package Address;

public class Address implements addressData {

    private String AddressLine1;
    private String AddressLine2;
    private String city;
    private String state;
    private String pinCode;


    public String getAddressLine1() {
        return AddressLine1;
    }

    public String getAddressLine2() {
        return AddressLine2;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getPinCode() {
        return pinCode;
    }


    @Override
    public String Address_Line1(String addressLine1) {
        return this.AddressLine1 = addressLine1;
    }

    @Override
    public String Address_Line2(String addressLine2) {
        return this.AddressLine2 = addressLine2;
    }

    @Override
    public String City(String city) {
        return this.city = city;
    }

    @Override
    public String State(String state) {
        return this.state = state;
    }

    @Override
    public String PinCode(String pinCode) {
        return this.pinCode = pinCode;
    }


}
