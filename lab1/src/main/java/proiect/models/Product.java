package main.java.proiect.models;

public class Product {
    private String id;
    private String name;
    private String description;
    private int price;

    public Product(String id, String name, String description, int price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public Product(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = 0;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String toString() {
        return "Product: " + this.name + " " + this.description + " " + this.price;
    }


}
