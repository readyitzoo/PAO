package main.java.proiect;

import main.java.proiect.models.*;
import main.java.proiect.services.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int index_client = 0;
        int index_driver = 0;
        int index_food = 0;
        int index_drink = 0;

        // Create a crud service for users
        int choice = 0;
        System.out.println("Welcome to the Food Delivery App!");

        ClientService clientService = new ClientService();

        DriverService driverService = new DriverService();

        DrinkService drinkService = new DrinkService();

        FoodService foodService = new FoodService();
        while (choice != 20)
        {
            System.out.println("Please select an option:");
            System.out.println("1. Add a client");
            System.out.println("2. List clients");
            System.out.println("3. Update client email");
            System.out.println("4. Update client points");
            System.out.println("5. Delete client");

            System.out.println("6. List drivers");
            System.out.println("7. Add a driver");
            System.out.println("8. Update driver phone number");
            System.out.println("9. Update driver salary");
            System.out.println("10. Delete driver");

            System.out.println("11. Add a food");
            System.out.println("12. List foods");
            System.out.println("13. Update food");
            System.out.println("14. Delete food");

            System.out.println("15. Add a drink");
            System.out.println("16. List drinks");
            System.out.println("17. Update drink");
            System.out.println("18. Delete drink");

            System.out.println("19. Exit");

            choice = scanner.nextInt();
            scanner.nextLine();


            switch (choice) {
                case 1:
                    clientService.addClient(scanner, index_client);
                    index_client++;
                    break;
                case 2:
                    clientService.getClients();
                    break;
                case 3:
                    System.out.println("Please enter the client's id you want to update:");
                    int id_client = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Please enter the new email:");
                    String email_client = scanner.nextLine();
                    clientService.updateClientEmail(id_client, email_client);
                    break;
                case 4:
                    System.out.println("Please enter the client's id you want to update:");
                    int id_client1 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Please enter the new points:");
                    int points_client = scanner.nextInt();
                    scanner.nextLine();
                    clientService.updateClientPoints(id_client1, points_client);
                    break;
                case 5:
                    System.out.println("Please enter the client's id you want to delete:");
                    int id_client2 = scanner.nextInt();
                    scanner.nextLine();
                    clientService.deleteClient(id_client2);
                    break;
                case 6:
                    driverService.getDrivers();
                    break;
                case 7:
                    driverService.addDriver(scanner, index_driver);
                    index_driver++;
                    break;
                case 8:
                    System.out.println("Please enter the driver's id you want to update:");
                    int id_driver = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Please enter the new phone number:");
                    String phoneNumber_driver = scanner.nextLine();
                    driverService.updateDriverPhoneNumber(id_driver, phoneNumber_driver);
                    break;
                case 9:
                    System.out.println("Please enter the driver's id you want to update:");
                    int id_driver1 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Please enter the new salary:");
                    int salary_driver = scanner.nextInt();
                    scanner.nextLine();
                    driverService.updateDriverSalary(id_driver1, salary_driver);
                    break;
                case 10:
                    System.out.println("Please enter the driver's id you want to delete:");
                    int id_driver2 = scanner.nextInt();
                    scanner.nextLine();
                    driverService.deleteDriver(id_driver2);
                    break;
                case 11:
                    foodService.addFood(scanner, index_food);
                    index_food++;
                    break;
                case 12:
                    foodService.getFoods();
                    break;
                case 13:
                    System.out.println("Please enter the food's id you want to update:");
                    int id_food = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Please enter the new price:");
                    int price_food = scanner.nextInt();
                    scanner.nextLine();
                    foodService.updateFood(id_food, price_food);
                    break;
                case 14:
                    System.out.println("Please enter the food's id you want to delete:");
                    int id_food1 = scanner.nextInt();
                    scanner.nextLine();
                    foodService.deleteFood(id_food1);
                    break;
                case 15:
                    drinkService.addDrink(scanner, index_drink);
                    index_drink++;
                    break;
                case 16:
                    drinkService.getDrinks();
                    break;
                case 17:
                    System.out.println("Please enter the drink's id you want to update:");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Please enter the new price:");
                    int price = scanner.nextInt();
                    scanner.nextLine();
                    drinkService.updateDrink(id, price);
                    break;
                case 18:
                    System.out.println("Please enter the drink's id you want to delete:");
                    int id1 = scanner.nextInt();
                    scanner.nextLine();
                    drinkService.deleteDrink(id1);
                    break;
                case 19:
                    System.out.println("Thank you for using our app!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option!");
                    break;
            }
        }


    }


}
