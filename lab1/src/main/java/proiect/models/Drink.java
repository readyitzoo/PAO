package main.java.proiect.models;

public class Drink extends Product {
    private String volume;
    private String alcoholContent;

    public Drink(String id, String name, String description, String price, String volume, String alcoholContent) {
        super(id, name, description, Integer.parseInt(price));
        this.volume = volume;
        this.alcoholContent = alcoholContent;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getAlcoholContent() {
        return alcoholContent;
    }

    public void setAlcoholContent(String alcoholContent) {
        this.alcoholContent = alcoholContent;
    }



}
