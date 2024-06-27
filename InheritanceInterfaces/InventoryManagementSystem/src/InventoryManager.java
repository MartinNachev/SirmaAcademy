import ItemTypes.InventoryItem;

import java.util.LinkedHashMap;
import java.util.Map;

public class InventoryManager {

    public void addItemToRepository(ItemRepository itemRepository, InventoryItem inventoryItem){
        itemRepository.getItemRepository()
                .putIfAbsent(inventoryItem.getCategory(), new LinkedHashMap<>());
        itemRepository.getItemRepository().get(inventoryItem
                .getCategory()).put(inventoryItem.getId(),inventoryItem);
    }
    public void removeItemById(ItemRepository itemRepository, int id){
        boolean itemRemoved = false;
        for(Map.Entry<String,LinkedHashMap<Integer, InventoryItem>> entry : itemRepository.getItemRepository().entrySet()){
            if (entry.getValue().remove(id)!=null){
                itemRemoved = true;
                break;
            }
        }
        if (!itemRemoved){
            System.out.println("Item with ID " + id + " was not found in the repository.");
        }
    }
    public void displayAllItems(ItemRepository itemRepository){
        if (itemRepository.getItemRepository().isEmpty()){
            System.out.println("The repository is empty");
            return;
        }
        for(Map.Entry<String,LinkedHashMap<Integer, InventoryItem>> entry : itemRepository.getItemRepository().entrySet()){
            System.out.println(entry.getKey() + " -> ");
            entry.getValue().forEach((k,v) -> System.out.println(v.getItemDetails()));
        }
    }
    public void displayItemsByCategory(ItemRepository itemRepository, String category){
        if (!itemRepository.getItemRepository().containsKey(category)){
            System.out.println("This category did not exist");
            return;
        }
        itemRepository.getItemRepository().get(category)
                .forEach((k,v) -> System.out.println(v.getItemDetails()));
    }
}