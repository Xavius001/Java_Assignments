package Assessment3;

public class Address {
    private String hNo, street, city, zipcode, country;

    public String gethNo() {
        return hNo;
    }

    public void sethNo(String hNo) {
        this.hNo = hNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Address() {
    }

    public Address(String hNo, String street, String city, String zipcode, String country) {
        this.hNo = hNo;
        this.street = street;
        this.city = city;
        this.zipcode = zipcode;
        this.country = country;
    }
}
