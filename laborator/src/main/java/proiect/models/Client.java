package main.java.proiect.models;

import java.util.Objects;

public class Client extends Person {
    private String username;
    private int points;
    private int orders;

    public Client(String name, String address, String phoneNumber, String email, String username, int points, int orders) {
        super(name, address, phoneNumber, email);
        this.username = username;
        this.points = points;
        this.orders = orders;
    }

    public Client() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getOrders() {
        return orders;
    }

    public void setOrders(int orders) {
        this.orders = orders;
    }

    public String toString() {
        return "Client: " + super.toString() + " " + this.username + " " + this.points + " " + this.orders;
    }

    public String toCSV() {
        return super.getName() + "," + super.getAddress() + "," + super.getPhoneNumber() + "," + super.getEmail() + "," + this.username + "," + this.points + "," + this.orders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client)) return false;
        if (!super.equals(o)) return false;
        Client client = (Client) o;
        return  points == client.points &&
                orders == client.orders &&
                Objects.equals(username, client.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), username, points, orders);
    }



}
