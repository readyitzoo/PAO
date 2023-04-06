package main.java.proiect.models;

import java.util.Objects;

public class Driver extends Person {
    // driver will be an employee of the company and will have a salary
    private int salary;
    private String CNP;

    public Driver(String name, String address, String phoneNumber, String email, int salary, String CNP) {
        super(name, address, phoneNumber, email);
        this.salary = salary;
        this.CNP = CNP;
    }

    public Driver() {
        super();
        this.salary = 0;
        this.CNP = "";
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCNP() {
        return CNP;
    }

    public void setCNP(String CNP) {
        this.CNP = CNP;
    }

    public String toString() {
        return "Driver: " + super.toString() + " " + this.salary + " " + this.CNP;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Driver)) return false;
        if (!super.equals(o)) return false;
        Driver driver = (Driver) o;
        return salary == driver.salary &&
                Objects.equals(CNP, driver.CNP);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), salary, CNP);
    }

    public String toCSV() {
        return super.getName() + "," + super.getAddress() + "," + super.getPhoneNumber() + "," + super.getEmail() + "," + this.salary + "," + this.CNP;
    }

    public static Driver fromCSV(String csv) {
        String[] tokens = csv.split(",");
        return new Driver(tokens[0], tokens[1], tokens[2], tokens[3], Integer.parseInt(tokens[4]), tokens[5]);
    }

    public static Driver[] getDrivers() {
        Driver[] drivers = new Driver[5];
        drivers[0] = new Driver("John Doe", "Strada X, nr. 1", "0722222222", "JohnDoe@gmail.com", 2000, "1234567890123");
        drivers[1] = new Driver("Jane Doe", "Strada X, nr. 2", "0722222223", "JaneDoe@gmail.com", 2000, "1234567890124");
        drivers[2] = new Driver("Meggan Doe", "Strada Y, nr. 1", "0722222222", "MegganDoe@gmail.com", 3000, "1234567890125");

        return drivers;
    }
}
