package za.ac.cput.domain;

public class Address {
    private String street;
    private String city;
    private String postalCode;

    // Constructor
    public Address(String street, String city, String postalCode) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }

    // Getter methods
    public String getStreet() { return street; }
    public String getCity() { return city; }
    public String getPostalCode() { return postalCode; }

    @Override
    public String toString() {
        return street + ", " + city + " - " + postalCode;
    }
}
