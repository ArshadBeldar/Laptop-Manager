import com.infogalaxy.Specification;

import java.util.ArrayList;
import java.util.Scanner;

public class LaptopManager {
    static Scanner scanner = new Scanner(System.in);
    ArrayList<LaptopInfo> laptopInfoArrayList = new ArrayList<>();

    LaptopInfo laptopInfo = new LaptopInfo();

    public void setLaptopInfo() {
        LaptopInfo laptopInfo = new LaptopInfo();

        System.out.println("Enter the Laptop series Number");
        laptopInfo.setSeriesNo(scanner.next());

        System.out.println("Enter the Laptop Model Number");
        laptopInfo.setModelNo(scanner.next());

        System.out.println("Enter the Price");
        laptopInfo.setPrice(scanner.next());

        System.out.println("Enter the Laptop Launch Year");
        laptopInfo.setLaunchyear(scanner.next());

        System.out.println("Enter the processor specification ");
        laptopInfo.specification.setProcessor(scanner.next());

        System.out.println("Enter the Generation");
        laptopInfo.specification.setGeneration(scanner.next());

        System.out.println("Enter the Ram Configuration");
        laptopInfo.specification.setRam(scanner.next());

        System.out.println("Enter the Hard disk Configuration");
        laptopInfo.specification.setHhd(scanner.next());

        System.out.println("Enter the SSD Configuration");
        laptopInfo.specification.setSsd(scanner.next());

        System.out.println("Enter the Screen Size ");
        laptopInfo.specification.setScreensize(scanner.next());

        System.out.println("Enter the keyboard configuration");
        laptopInfo.specification.setKeyboard(scanner.next());

        laptopInfoArrayList.add(laptopInfo);
    }

    public void displayLaptopInfo() {
        LaptopInfo laptopInfo = new LaptopInfo();
        for (int i = 0;i<laptopInfoArrayList.size();i++){

            laptopInfo = laptopInfoArrayList.get(i);
            int srno = i;
            System.out.println(srno+1+") ***** SHOWING THE LAPTOP INFORMATION ******");
            System.out.println(laptopInfo.toString());
            System.out.println(laptopInfo.specification.toString());
            System.out.println("");
        }


    }

    public static void main(String[] args) {
        int choice;
        LaptopManager laptopManager = new LaptopManager();

        do {
            System.out.println("WELCOME TO LAPTOP MANAGER");
            System.out.println("1: Laptop Information / 2: Show Laptop Information / 3: Exit:");
            System.out.println("ENTER THE CHOICE NUMBER");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    laptopManager.setLaptopInfo();
                    break;
                case 2:
                    laptopManager.displayLaptopInfo();
                    break;
                case 3:
                    System.out.println(" EXIT..");
                    break;
                default:
                    System.out.println("Invalid Operation Number");
                    break;
            }
        } while (choice < 3);
    }
}