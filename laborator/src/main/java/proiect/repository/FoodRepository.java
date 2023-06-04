package main.java.proiect.repository;

import main.java.proiect.config.DatabaseConnection;
import main.java.proiect.models.Food;
import main.java.proiect.services.AuditService;

import java.sql.PreparedStatement;
public class FoodRepository {
    AuditService auditService = new AuditService();
    public void getFoods() {
        String selectSql = "SELECT * FROM foods";
        try (PreparedStatement preparedStatement = DatabaseConnection.getInstance().prepareStatement(selectSql)) {
            var result = preparedStatement.executeQuery();
            while (result.next()){
                System.out.println("---------FOOD---------");
                System.out.println("ID: " + result.getInt("id"));
                System.out.println("Name: " + result.getString("name"));
                System.out.println("Description: " + result.getString("description"));
                System.out.println("Price: " + result.getInt("price"));
                System.out.println("Weight: " + result.getInt("weight"));
                System.out.println("-----------------------------");
            }
            auditService.addAction("getFoods");
        } catch (Exception e) {
            System.out.println("Something went wrong when trying to get foods: " + e.getMessage());
        }
    }

    public void addFood(Food food) {
        String insertSql = "INSERT INTO foods VALUES (null, ?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = DatabaseConnection.getInstance().prepareStatement(insertSql)) {
            preparedStatement.setString(1, food.getName());
            preparedStatement.setString(2, food.getDescription());
            preparedStatement.setInt(3, food.getPrice());
            preparedStatement.setInt(4, food.getWeight());

            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new food was inserted successfully!");
                auditService.addAction("addFood");
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteFood(Integer id) {
        String deleteSql = "DELETE FROM foods WHERE id = ?";
        try (PreparedStatement preparedStatement = DatabaseConnection.getInstance().prepareStatement(deleteSql)) {
            preparedStatement.setInt(1, id);

            int rowsDeleted = preparedStatement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("The food was deleted successfully!");
                auditService.addAction("deleteFood");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateFood(Integer id, int price) {
        String updateSql = "UPDATE foods SET price = ? WHERE id = ?";
        try (PreparedStatement preparedStatement = DatabaseConnection.getInstance().prepareStatement(updateSql)) {
            preparedStatement.setInt(1, price);
            preparedStatement.setInt(2, id);

            int rowsUpdated = preparedStatement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("The food was updated successfully!");
                auditService.addAction("updateFood");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
