package main.java.proiect.models;

public class Restaurant {
    private int id;
    private String name;
    private String address;
    private String phoneNumber;
    private String email;
    private String website;

    public Restaurant() {
        this.id = 0;
        this.name = " ";
        this.address = " ";
        this.phoneNumber = " ";
        this.email = " ";
        this.website = " ";
    }
    public Restaurant(String name, String address, String phoneNumber, String email, String website) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.website = website;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) { this.id = id; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String toString() {
        return "Restaurant: " + this.name + " " + this.address + " " + this.phoneNumber + " " + this.email + " " + this.website;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Restaurant restaurant = (Restaurant) o;
        return website.equals(restaurant.website)
                && email.equals(restaurant.email);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + address.hashCode();
        result = 31 * result + phoneNumber.hashCode();
        result = 31 * result + email.hashCode();
        result = 31 * result + website.hashCode();
        return result;
    }


}
