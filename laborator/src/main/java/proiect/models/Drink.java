package main.java.proiect.models;

public class Drink extends Product {
    private int volume;
    private double alcoholContent;

    public Drink(String name, String description, int price, int volume, double alcoholContent) {
        super(name, description, price);
        this.volume = volume;
        this.alcoholContent = alcoholContent;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public double getAlcoholContent() {
        return alcoholContent;
    }

    public void setAlcoholContent(double alcoholContent) {
        this.alcoholContent = alcoholContent;
    }

    @Override
    public String toString() {
        return "Drink: " + super.toString() + " " + this.volume + " " + this.alcoholContent;
    }





}
