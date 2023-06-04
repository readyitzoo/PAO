package main.java.proiect.models;

import java.util.Date;

public class Food extends Product {
    private int weight;

    public Food(String name, String description, int price, int weight) {
        super(name, description, price);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String toString() {
        return "Food: " + super.toString() + " " + this.weight;
    }
}
