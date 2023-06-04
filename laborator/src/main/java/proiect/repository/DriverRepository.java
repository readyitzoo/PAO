package main.java.proiect.repository;

import main.java.proiect.config.DatabaseConnection;
import main.java.proiect.models.Driver;
import main.java.proiect.services.AuditService;

import java.sql.PreparedStatement;

public class DriverRepository {

    AuditService auditService = new AuditService();
    public void getDrivers(){
        String sql = "SELECT * FROM drivers";
        try(PreparedStatement statement = DatabaseConnection.getInstance().prepareStatement(sql)){
            var result = statement.executeQuery();
            while(result.next()){
                System.out.println("Id: " + result.getInt(1));
                System.out.println("Name: " + result.getString(2));
                System.out.println("Address: " + result.getString(3));
                System.out.println("Phone number: " + result.getString(4));
                System.out.println("Email: " + result.getString(5));
                System.out.println("Salary: " + result.getInt(6));
                System.out.println("CNP: " + result.getString(7));
            }
            auditService.addAction("getDrivers");
        } catch (Exception e) {
            System.out.println("Something went wrong when trying to get drivers from database: " + e.getMessage());
        }
    }

    public void addDriver(Driver driver){
        String insertSql = "INSERT INTO drivers VALUES (null, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = DatabaseConnection.getInstance().prepareStatement(insertSql)) {
            preparedStatement.setString(1, driver.getName());
            preparedStatement.setString(2, driver.getAddress());
            preparedStatement.setString(3, driver.getPhoneNumber());
            preparedStatement.setString(4, driver.getEmail());
            preparedStatement.setInt(5, driver.getSalary());
            preparedStatement.setString(6, driver.getCNP());


            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new drivers was inserted successfully!");
                auditService.addAction("addDrink");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteDriver(Integer id){
        String sql = "DELETE FROM drivers WHERE id = ?";
        try(PreparedStatement preparedStatement = DatabaseConnection.getInstance().prepareStatement(sql)){
            preparedStatement.setInt(1, id);
            int rowsDeleted = preparedStatement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("A driver was deleted successfully!");
                auditService.addAction("deleteDriver");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void updateDriverSalary(Integer id, Integer salary){
        String sql = "UPDATE drivers SET salary = ? WHERE id = ?";
        try(PreparedStatement preparedStatement = DatabaseConnection.getInstance().prepareStatement(sql)){
            preparedStatement.setInt(1, salary);
            preparedStatement.setInt(2, id);
            int rowsUpdated = preparedStatement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("An existing driver was updated successfully!");
                auditService.addAction("updateDriverSalary");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateDriverPhoneNumber(Integer id, String phoneNumber){
        String sql = "UPDATE drivers SET phoneNumber = ? WHERE id = ?";
        try(PreparedStatement preparedStatement = DatabaseConnection.getInstance().prepareStatement(sql)){
            preparedStatement.setString(1, phoneNumber);
            preparedStatement.setInt(2, id);
            int rowsUpdated = preparedStatement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("An existing driver was updated successfully!");
                auditService.addAction("updateDriverPhoneNumber");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
