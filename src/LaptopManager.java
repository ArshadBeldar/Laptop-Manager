import com.infogalaxy.Specification;

import java.util.Scanner;

public class LaptopManager {
    Scanner scanner = new Scanner(System.in);
    LaptopInfo laptopInfo = new LaptopInfo();

    public void setLaptopInfo(){
        System.out.println("Enter the Laptop series Number");
        laptopInfo.setSeriesNo(scanner.next());

        System.out.println("Enter the Laptop Model Number");
        laptopInfo.setModelNo(scanner.next());

        System.out.println("Enter the Price");
        laptopInfo.setPrice(scanner.next());

        System.out.println("Enter the Laptop Launch Year");
        laptopInfo.setLaunchyear(scanner.next());

    }

    public void setSpecification(){
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
    }

    public void displayLaptopInfo(){

        System.out.println(laptopInfo.toString());
        System.out.println(laptopInfo.specification.toString());
    }
    public static void main(String[] args) {
        LaptopManager laptopManager = new LaptopManager();

        laptopManager.setLaptopInfo();
        laptopManager.setSpecification();
        laptopManager.displayLaptopInfo();
    }
}