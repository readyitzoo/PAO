package main.java.proiect.services;
import main.java.proiect.models.Restaurant;

import java.util.Map;
import java.util.Scanner;
public class RestaurantService {
    public void addRestaurant(Map<Integer, Restaurant> RestaurantMap, Scanner scanner, int index_restaurant){
        System.out.println("Enter the name of the restaurant: ");
        String name = scanner.nextLine();
        System.out.println("Enter the address of the restaurant: ");
        String address = scanner.nextLine();
        System.out.println("Enter the phone number of the restaurant: ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Enter the email of the restaurant: ");
        String email = scanner.nextLine();
        System.out.println("Enter the website of the restaurant: ");
        String website = scanner.nextLine();
        Restaurant restaurant = new Restaurant(name, address, phoneNumber, email, website);
        restaurant.setId(index_restaurant);
        RestaurantMap.put(index_restaurant, restaurant);
    }

    public void deleteRestaurant(Map<Integer, Restaurant> RestaurantMap, Scanner scanner){
        System.out.println("Please enter the restaurant's id you want to delete:");
        int id = scanner.nextInt();
        scanner.nextLine();
        RestaurantMap.remove(id);
        System.out.println("Restaurant deleted successfully");
    }
    public void updateRestaurant(Map <Integer, Restaurant> RestaurantMap, Scanner scanner) {
        System.out.println("Existing restaurants:");
        for (Map.Entry<Integer, Restaurant> entry : RestaurantMap.entrySet()) {
            System.out.println(entry.getValue());
        }
        System.out.println("Please enter the restaurant's id you want to update:");
        int id = scanner.nextInt();
        scanner.nextLine();
        Restaurant restaurant = RestaurantMap.get(id);
        System.out.println("Please enter the new phone number:");
        String phoneNumber = scanner.nextLine();
        restaurant.setPhoneNumber(phoneNumber);
        System.out.println("Restaurant updated successfully");
    }
    public void displayRestaurants(Map <Integer, Restaurant> RestaurantMap) {
        System.out.println("Existing restaurants:");
        for (Map.Entry<Integer, Restaurant> entry : RestaurantMap.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
