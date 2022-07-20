package com.infogalaxy;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LaptopManagerMaster {
    static Scanner scanner = new Scanner(System.in);

    Map<String, LaptopManager> laptopManagerMap = new HashMap<>();

    public void addLaptopMap() {
        String laptopMapName;

        System.out.println("Enter the Company Name");
        laptopMapName = scanner.next();
        LaptopManager laptopManager = new LaptopManager();
        laptopManagerMap.put(laptopMapName, laptopManager);
    }

    public void displayLaptopMap() {

        System.out.println(laptopManagerMap.keySet());
    }

    public void selectLaptopMap() {
        displayLaptopMap();

        System.out.println("Enter the Company name");
        String companyname = scanner.next();
        String Name;
        Name = companyname;
        LaptopManager laptopManager = laptopManagerMap.get(companyname);
        laptopManager.laptopManu(laptopManager,Name);

    }

    public static void main(String args[]) {
        LaptopManagerMaster laptopManagerMaster = new LaptopManagerMaster();


        int choice;
        do {
            System.out.println("*******WELCOME TO LAPTOP MANAGER MASTER******");
            System.out.println("1: ADD_LAPTOP_MAP /2: SHOW_LAPTOP_MAP /3: SELECT_LAPTOP_MAP  /4: EXIT..");
            System.out.println("ENTER THE OPERATION NUMBER FOR LAPTOP MAP");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    laptopManagerMaster.addLaptopMap();
                    break;
                case 2:
                    laptopManagerMaster.displayLaptopMap();
                    break;
                case 3:
                    laptopManagerMaster.selectLaptopMap();
                    break;
                case 4:
                    System.out.println("EXIT..");
                    break;
            }
        } while (choice < 4);

    }
}
