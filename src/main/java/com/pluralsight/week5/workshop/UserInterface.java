package com.pluralsight.week5.workshop;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private Dealership dealership;
    private Scanner scanner = new Scanner(System.in);

    public UserInterface() {
    }

    private void init() {
        dealership = DealershipFileManager.getDealership("files/dealership.csv");
    }

    public void display() {
        init();
        boolean isRunning = true;
        while(isRunning) {
            System.out.println("What do you want to do?");
            System.out.println(getMenu());
            String choice = scanner.nextLine();
            switch(choice) {
                case "1":
                    processGetByPriceRequest();
                    break;
                case "2":
                    processGetByMakeModelRequest();
                    break;
                case "3":
                    processGetByYearRequest();
                    break;
                case "4":
                    processGetByColorRequest();
                    break;
                case "5":
                    processGetByMileageRequest();
                    break;
                case "6":
                    processGetByVehicleTypeRequest();
                    break;
                case "7":
                    processGetAllVehiclesRequest();
                    break;
                case "8":
                    processAddVehicleRequest();
                    break;
                case "9":
                    processRemoveVehicleRequest();
                    break;
                case "99":
                    isRunning = false;
                    break;
                default:
                    System.out.println("That's not an option. Please try again.");

            }
        }

    }

    public void processGetByPriceRequest() {
        System.out.println("What is the min price?");
        double min = Double.parseDouble(scanner.nextLine());
        System.out.println("What is the max price?");
        double max = Double.parseDouble(scanner.nextLine());
        displayVehicles(dealership.getVehiclesByPrice(min, max));
    }

    public void processGetByMakeModelRequest() {
        System.out.println("What is the make?");
        String make = scanner.nextLine();
        System.out.println("What is the model?");
        String model = scanner.nextLine();
        displayVehicles(dealership.getVehiclesByMakeModel(make, model));
    }

    public void processGetByYearRequest() {
        System.out.println("What is the min year?");
        int min = Integer.parseInt(scanner.nextLine());
        System.out.println("What is the max year?");
        int max = Integer.parseInt(scanner.nextLine());
        displayVehicles(dealership.getVehiclesByYear(min, max));
    }

    public void processGetByColorRequest() {
        System.out.println("What is the color?");
        displayVehicles(dealership.getVehiclesByColor(scanner.nextLine()));
    }

    public void processGetByMileageRequest() {
        System.out.println("What is the min mileage?");
        int min = Integer.parseInt(scanner.nextLine());
        System.out.println("What is the max mileage?");
        int max = Integer.parseInt(scanner.nextLine());
        displayVehicles(dealership.getVehiclesByMileage(min, max));
    }

    public void processGetByVehicleTypeRequest() {
        System.out.println("What is the type?");
        displayVehicles(dealership.getVehiclesByType(scanner.nextLine()));
    }

    public void processGetAllVehiclesRequest() {
        List<Vehicle> vehicles = dealership.getAllVehicles();
        displayVehicles(vehicles);
    }

    public void processAddVehicleRequest() {
        System.out.println("Let's get the details for the vehicle you'd want to add.");
        dealership.addVehicle(buildVehicleWithUserInput());
    }

    public void processRemoveVehicleRequest() {
        System.out.println("Let's get the details for the vehicle you want to remove.");
        dealership.removeVehicle(buildVehicleWithUserInput());
    }

    public Vehicle buildVehicleWithUserInput() {
        System.out.println("What is the VIN?");
        int vin = Integer.parseInt(scanner.nextLine());
        System.out.println("Year please?");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.println("Make?");
        String make = scanner.nextLine();
        System.out.println("Model?");
        String model = scanner.nextLine();
        System.out.println("Vehicle type?");
        String vehicleType = scanner.nextLine();
        System.out.println("Color?");
        String color = scanner.nextLine();
        System.out.println("Mileage please?");
        int mileage = Integer.parseInt(scanner.nextLine());
        System.out.println("Price?");
        double price = Double.parseDouble(scanner.nextLine());

        return new Vehicle(vin, year, make,  model, vehicleType, color, mileage, price);
    }

    public String getMenu() {
        return """
                1 - Find vehicles within a price range
                2 - Find vehicles by make / model
                3 - Find vehicles by year range
                4 - Find vehicles by color
                5 - Find vehicles by mileage range
                6 - Find vehicles by type (car, truck, SUV, van)
                7 - List ALL vehicles
                8 - Add a vehicle
                9 - Remove a vehicle
                99 - Quit
                """;
    }

    public void displayVehicles(List<Vehicle> vehicleList) {
        for(Vehicle vehicle : vehicleList) {
            System.out.println(vehicle.getVehicleCsvLine());
        }
    }


}
