package main.java.proiect.models;

import java.lang.reflect.Array;

public class Order {
    private int id;

    private Client client;

    private Restaurant restaurant;

    private Driver driver;

    private Food food;

    private Drink drink;

    public Order(Client client, Restaurant restaurant, Driver driver, Food food, Drink drink) {
        this.client = client;
        this.restaurant = restaurant;
        this.driver = driver;
        this.food = food;
        this.drink = drink;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public String toString() {
        return "Order: " + this.client + " " + this.restaurant + " " + this.driver + " " + this.food + " " + this.drink;
    }



}