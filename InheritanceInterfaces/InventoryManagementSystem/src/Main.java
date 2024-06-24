import ItemTypes.ElectronicsItem;
import ItemTypes.InventoryItem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        UserInterface.displayOptions();
        ItemRepository itemRepository = new ItemRepository();
        InventoryManager inventoryManager = new InventoryManager();
        int n = Integer.parseInt(scanner.nextLine());
        while(n != 0){
            if (n == 1){
                System.out.println("Enter the category of the item: ");
                UserInterface.displayExistingCategories();
                InventoryItem item = createItem(scanner.nextLine(),scanner);
                inventoryManager.addItem(itemRepository,item);
            } else if (n == 2) {
                UserInterface.displayItemId(itemRepository);
                System.out.println("Select the id of the item you would like to remove: ");
                inventoryManager.removeItemById(itemRepository, Integer.parseInt(scanner.nextLine()));
            }
            n = Integer.parseInt(scanner.nextLine());
        }


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