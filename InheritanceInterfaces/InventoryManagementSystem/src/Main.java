import ItemTypes.ElectronicsItem;
import ItemTypes.InventoryItem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        UserInterface.displayOptions();
        System.out.println("Choose an operation: ");
        int input = Integer.parseInt(scanner.nextLine());
        InventoryManager inventoryManager = new InventoryManager();
        ItemRepository itemRepository = new ItemRepository();
        while (input != 0){
            String category;
            switch (input){
                case 1:
                    System.out.println("Enter the category of the item listed below: ");
                    UserInterface.listItemsCategories();
                    category = scanner.nextLine().toLowerCase();
                    InventoryItem newItem = createItem(category,scanner);
                    inventoryManager.addItemToRepository(itemRepository,newItem);
                    break;
                case 2:
                    System.out.println("Enter the id of the item to be removed: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    inventoryManager.removeItemById(itemRepository,id);
                    break;
                case 3:
                    inventoryManager.displayAllItems(itemRepository);
                    break;
                case 4:
                    System.out.println("Enter category: ");
                    category = scanner.nextLine().toLowerCase();
                    inventoryManager.displayItemsByCategory(itemRepository, category);
                    break;
                case 5:

            }
            UserInterface.displayOptions();
            System.out.println("Choose an operation: ");
            input = Integer.parseInt(scanner.nextLine());
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