package main.java.proiect.repository;

import main.java.proiect.config.DatabaseConnection;
import main.java.proiect.models.Drink;
import main.java.proiect.services.AuditService;

import java.sql.PreparedStatement;

public class DrinkRepository {
    AuditService auditService = new AuditService();

    public void getDrinks() {
        String selectSql = "SELECT * FROM drinks";
        try (PreparedStatement preparedStatement = DatabaseConnection.getInstance().prepareStatement(selectSql)) {
            var result = preparedStatement.executeQuery();
            while (result.next()){
                System.out.println("---------DRINK---------");
                System.out.println("ID: " + result.getInt("id"));
                System.out.println("Name: " + result.getString("name"));
                System.out.println("Description: " + result.getString("description"));
                System.out.println("Price: " + result.getInt("price"));
                System.out.println("Volume: " + result.getInt("volume"));
                System.out.println("Alcohol content: " + result.getDouble("alcohol_content"));
                System.out.println("-----------------------------");
            }
            auditService.addAction("getDrinks");
        } catch (Exception e) {
            System.out.println("Something went wrong when trying to get drinks: " + e.getMessage());
        }
    }

    public void addDrink(Drink drink) {
        String insertSql = "INSERT INTO drinks VALUES (null, ?, ?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = DatabaseConnection.getInstance().prepareStatement(insertSql)) {
            preparedStatement.setString(1, drink.getName());
            preparedStatement.setString(2, drink.getDescription());
            preparedStatement.setInt(3, drink.getPrice());
            preparedStatement.setInt(4, drink.getVolume());
            preparedStatement.setDouble(5, drink.getAlcoholContent());

            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new drink was inserted successfully!");
                auditService.addAction("addDrink");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteDrink(Integer id) {
        String deleteSql = "DELETE FROM drinks WHERE id = ?";
        try (PreparedStatement preparedStatement = DatabaseConnection.getInstance().prepareStatement(deleteSql)) {
            preparedStatement.setInt(1, id);

            int rowsDeleted = preparedStatement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("The drink was deleted successfully!");
                auditService.addAction("deleteDrink");
            }
        } catch (Exception e) {
            System.out.println("Something went wrong when trying to delete a drink: " + e.getMessage());
        }
    }

    public void updateDrink(Integer id, Integer price) {
        String updateSql = "UPDATE drinks SET price = ? WHERE id = ?";
        try (PreparedStatement preparedStatement = DatabaseConnection.getInstance().prepareStatement(updateSql)) {
            preparedStatement.setInt(2, id);
            preparedStatement.setInt(1, price);

            int rowsUpdated = preparedStatement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("The drink was updated successfully!");
                auditService.addAction("updateDrink");
            }
        } catch (Exception e) {
            System.out.println("Something went wrong when trying to update a drink: " + e.getMessage());
        }
    }
}
