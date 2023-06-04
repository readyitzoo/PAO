package main.java.proiect.services;

import main.java.proiect.models.Driver;
import main.java.proiect.repository.DriverRepository;

import java.util.Scanner;
public class DriverService {
    DriverRepository driverRepository = new DriverRepository();
    public void addDriver(Scanner scanner, int index_driver){
        System.out.println("Enter the name of the driver: ");
        String name = scanner.nextLine();
        System.out.println("Enter the address of the driver: ");
        String address = scanner.nextLine();
        System.out.println("Enter the phone number of the driver: ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Enter the email of the driver: ");
        String email = scanner.nextLine();
        System.out.println("Enter the salary of the driver: ");
        int salary = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the CNP of the driver: ");
        String CNP = scanner.nextLine();
        Driver driver = new Driver(name, address, phoneNumber, email, salary, CNP);
        driver.setId(index_driver);
        driverRepository.addDriver(driver);

    }
    public void deleteDriver(Integer id){
        driverRepository.deleteDriver(id);
    }

    public void updateDriverSalary(Integer id, int salary){
        driverRepository.updateDriverSalary(id, salary);
    }
    public void updateDriverPhoneNumber(Integer id, String phoneNumber){
        driverRepository.updateDriverPhoneNumber(id, phoneNumber);
    }

    public void getDrivers(){
        driverRepository.getDrivers();
    }


}

