import ItemTypes.ElectronicsItem;
import ItemTypes.InventoryItem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


    }
    public static InventoryItem createItem(String category,Scanner sc){
        InventoryItem item = null;
        System.out.println("Enter the product: ");
        String product = sc.nextLine();
        System.out.println("Enter the price of the product: ");
        double price = Double.parseDouble(sc.nextLine());
        System.out.println("Enter the quantity of the product: ");
        int quantity = Integer.parseInt(sc.nextLine());
        System.out.println("Add description(optional).Enter N to skip this step: ");
        String description  = sc.nextLine();
        if (description.equalsIgnoreCase("n")){
            description = "none";
        }
        if ("electronics".equalsIgnoreCase(category)){
            System.out.println("Enter the brand of the product: ");
            String brand = sc.nextLine();
            System.out.println("Enter the model of the product: ");
            String model = sc.nextLine();

            item = new ElectronicsItem(product,category,price,description, quantity,brand,model);
        }
        return item;
    }
}