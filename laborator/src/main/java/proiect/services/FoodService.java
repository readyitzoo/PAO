package main.java.proiect.services;

import main.java.proiect.models.Food;
import main.java.proiect.repository.FoodRepository;

import java.util.Scanner;

public class FoodService {
    FoodRepository foodRepository = new FoodRepository();

    public void addFood(Scanner scanner, int index_food){
        System.out.println("Enter the name of the food: ");
        String name = scanner.nextLine();
        System.out.println("Enter the description of the food: ");
        String description = scanner.nextLine();
        System.out.println("Enter the price of the food: ");
        int price = scanner.nextInt();
        System.out.println("Enter the weight of the food: ");
        int weight = scanner.nextInt();
        Food food = new Food(name, description, price, weight);
        food.setId(index_food);
        foodRepository.addFood(food);
    }
    public void deleteFood(Integer id){
        foodRepository.deleteFood(id);
    }
    public void updateFood(Integer id, int price){
        foodRepository.updateFood(id, price);
    }

    public void getFoods(){
        foodRepository.getFoods();
    }
}
