package main.java.proiect.services;
import main.java.proiect.models.Drink;
import main.java.proiect.repository.DrinkRepository;

import java.util.Scanner;
public class DrinkService {
    DrinkRepository drinkRepository = new DrinkRepository();
    public void addDrink(Scanner scanner, int index_drink){
        System.out.println("Enter the name of the drink: ");
        String name = scanner.nextLine();
        System.out.println("Enter the description of the drink: ");
        String description = scanner.nextLine();
        System.out.println("Enter the price of the drink: ");
        int price = scanner.nextInt();
        System.out.println("Enter the volume of the drink: ");
        int volume = scanner.nextInt();
        System.out.println("Enter the alcohol content of the drink: ");
        double alcoholContent = scanner.nextDouble();
        Drink drink = new Drink(name, description, price, volume, alcoholContent);
        drink.setId(index_drink);
        drinkRepository.addDrink(drink);
    }
    public void deleteDrink(Integer id){
        drinkRepository.deleteDrink(id);
    }
    public void updateDrink(Integer id, int price){
        drinkRepository.updateDrink(id, price);
    }

    public void getDrinks(){
        drinkRepository.getDrinks();
    }
}