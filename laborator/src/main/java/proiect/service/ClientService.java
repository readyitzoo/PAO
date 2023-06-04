package main.java.proiect.service;

import main.java.proiect.models.Client;

import java.util.Map;
import java.util.Scanner;

public class ClientService {


    public void addClient(Map<Integer, Client> clientMap, Scanner scanner, int index) {
        System.out.println("Introduceti numele clientului: ");
        String name = scanner.nextLine();
        System.out.println("Introduceti adresa clientului: ");
        String address = scanner.nextLine();
        System.out.println("Introduceti numarul de telefon al clientului: ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Introduceti email-ul clientului: ");
        String email = scanner.nextLine();
        System.out.println("Introduceti username-ul clientului: ");
        String username = scanner.nextLine();
        System.out.println("Introduceti punctele clientului: ");
        int points = scanner.nextInt();
        System.out.println("Introduceti numarul de comenzi al clientului: ");
        int orders = scanner.nextInt();
        Client client = new Client(name, address, phoneNumber, email, username, points, orders);
        client.setId(index);
        clientMap.put(client.getId(), client);
        System.out.println("Client adaugat cu succes");
        System.out.println(client.getId());
    }

    public void deleteClient(Map<Integer, Client> clientMap, Scanner scanner) {
        System.out.println("Introduceti id-ul clientului pe care doriti sa il stergeti: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        clientMap.remove(id);
        System.out.println("Client sters cu succes");
    }

    public void updateClientEmail(Map<Integer, Client> clientMap, Scanner scanner) {
        System.out.println("Clientii existenti: ");
        for (Map.Entry<Integer, Client> entry : clientMap.entrySet()) {
            System.out.println(entry.getValue());
        }

        System.out.println("Introduceti id-ul clientului pe care doriti sa il actualizati: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        Client client = clientMap.get(id);
        System.out.println("Introduceti noul email: ");
        String email = scanner.nextLine();
        client.setEmail(email);
        System.out.println("Client actualizat cu succes");
    }

    public void printClient(Map<Integer, Client> clientMap) {
        System.out.println("Clientii existenti: ");
        for (Map.Entry<Integer, Client> entry : clientMap.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
