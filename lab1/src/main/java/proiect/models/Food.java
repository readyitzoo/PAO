package main.java.proiect.models;

public class Food extends Product {
    private String expirationDate;
    private String weight;

    public Food(String id, String name, String description, String price, String expirationDate, String weight) {
        super(id, name, description, Integer.parseInt(price));
        this.expirationDate = expirationDate;
        this.weight = weight;
    }

    public Food(String id, String name, String description, String price) {
        super(id, name, description, Integer.parseInt(price));
        this.expirationDate = "";
        this.weight = "";
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}
