package main.java.proiect;

import main.java.proiect.models.*;
import main.java.proiect.service.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Integer, Client> clients = new HashMap<>();
        Map<Integer, Restaurant> restaurants = new HashMap<>();
        Map<Integer, Driver> drivers = new HashMap<>();
        Map<Integer, Food> foods = new HashMap<>();
        Map<Integer, Drink> drinks = new HashMap<>();
        ArrayList<Order> orders = new ArrayList<>();

        int index_client = 0;

        // Create a crud service for users
        int choice = 0;
        System.out.println("Welcome to the Food Delivery App!");

        ClientService clientService = new ClientService();

        while (choice != 5)
        {
            System.out.println("Please select an option:");
            System.out.println("1. Add a client");
            System.out.println("2. List clients");
            System.out.println("3. Update client email");
            System.out.println("4. Delete client");
            System.out.println("5. Exit");

            choice = scanner.nextInt();
            scanner.nextLine();


            switch (choice) {
                case 1:
                    clientService.addClient(clients, scanner, index_client);
                    index_client++;
                    break;
                case 2:
                    clientService.printClient(clients);
                    break;
                case 3:
                    clientService.updateClientEmail(clients, scanner);
                    break;
                case 4:
                    clientService.deleteClient(clients, scanner);
                    break;
                case 5:
                    System.out.println("Thank you for using our app!");
                    break;
                default:
                    System.out.println("Invalid option!");
                    break;
            }
        }


    }


}
