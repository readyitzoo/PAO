package main.java.proiect.services;

import main.java.proiect.models.Client;
import main.java.proiect.repository.ClientRepository;

import java.util.Scanner;

public class ClientService {

    ClientRepository clientRepository = new ClientRepository();
    public void addClient(Scanner scanner, int index) {
        System.out.println("Enter the name of the client: ");
        String name = scanner.nextLine();
        System.out.println("Enter the address of the client: ");
        String address = scanner.nextLine();
        System.out.println("Enter the phone number of the client: ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Enter the email of the client: ");
        String email = scanner.nextLine();
        System.out.println("Enter the username of the client: ");
        String username = scanner.nextLine();
        System.out.println("Enter the points of the client: ");
        int points = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the orders of the client: ");
        int orders = scanner.nextInt();
        scanner.nextLine();
        Client client = new Client(name, address, phoneNumber, email, username, points, orders);
        client.setId(index);
        clientRepository.addClient(client);
    }

    public void deleteClient(Integer id) {
        clientRepository.deleteClient(id);
    }

    public void updateClientPoints(Integer id, int points) {
        clientRepository.updateClientPoints(id, points);
    }

    public void updateClientEmail(Integer id, String email) {
        clientRepository.updateClientEmail(id, email);
    }

    public void getClients() {
        clientRepository.getClients();
    }


}
