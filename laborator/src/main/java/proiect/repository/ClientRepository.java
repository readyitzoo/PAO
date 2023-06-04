package main.java.proiect.repository;

import main.java.proiect.models.Client;
import main.java.proiect.config.DatabaseConnection;
import main.java.proiect.services.AuditService;

import java.sql.PreparedStatement;

public class ClientRepository {

    AuditService auditService = new AuditService();
    public void getClients() {
        String sql = "SELECT * FROM clients";
        try(PreparedStatement statement = DatabaseConnection.getInstance().prepareStatement(sql)){
            var result = statement.executeQuery();
            while(result.next()){
                System.out.println("Id: " + result.getInt(1));
                System.out.println("Name: " + result.getString(2));
                System.out.println("Address: " + result.getString(3));
                System.out.println("Phone number: " + result.getString(4));
                System.out.println("Email: " + result.getString(5));
                System.out.println("Username: " + result.getString(6));
                System.out.println("Points: " + result.getInt(7));
                System.out.println("Orders: " + result.getInt(8));
            }
            auditService.addAction("getClients");
        } catch (Exception e) {
            System.out.println("Something went wrong when trying to get clients from database: " + e.getMessage());
        }
    }

    public void addClient(Client client) {

        String insertSql = "INSERT INTO clients VALUES (null, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = DatabaseConnection.getInstance().prepareStatement(insertSql)) {
            preparedStatement.setString(1, client.getName());
            preparedStatement.setString(2, client.getAddress());
            preparedStatement.setString(3, client.getPhoneNumber());
            preparedStatement.setString(4, client.getEmail());
            preparedStatement.setString(5, client.getUsername());
            preparedStatement.setInt(6, client.getPoints());
            preparedStatement.setInt(7, client.getOrders());

            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new client was inserted successfully!");
                auditService.addAction("addClient");
            }
    }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteClient(Integer id) {
//        AuditService auditService = AuditService.getInstance();
//        auditService.writeLog("ClientRepository", "deleteClient");

        String sql = "DELETE FROM clients WHERE id = ?";
        try(PreparedStatement preparedStatement = DatabaseConnection.getInstance().prepareStatement(sql)){
            preparedStatement.setInt(1, id);
            int rowsDeleted = preparedStatement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("A client was deleted successfully!");
                auditService.addAction("deleteClient");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateClientEmail(Integer id, String email) {
//        AuditService auditService = AuditService.getInstance();
//        auditService.writeLog("ClientRepository", "updateClientEmail");

        String sql = "UPDATE clients SET email = ? WHERE id = ?";
        try(PreparedStatement preparedStatement = DatabaseConnection.getInstance().prepareStatement(sql)){
            preparedStatement.setString(1, email);
            preparedStatement.setInt(2, id);
            int rowsUpdated = preparedStatement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("An existing client was updated successfully!");
                auditService.addAction("updateClientEmail");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateClientPoints(Integer id, int points) {
//        AuditService auditService = AuditService.getInstance();
//        auditService.writeLog("ClientRepository", "updateClientPoints");

        String sql = "UPDATE clients SET points = ? WHERE id = ?";
        try(PreparedStatement preparedStatement = DatabaseConnection.getInstance().prepareStatement(sql)){
            preparedStatement.setInt(1, points);
            preparedStatement.setInt(2, id);
            int rowsUpdated = preparedStatement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("An existing client was updated successfully!");
                auditService.addAction("updateClientPoints");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
