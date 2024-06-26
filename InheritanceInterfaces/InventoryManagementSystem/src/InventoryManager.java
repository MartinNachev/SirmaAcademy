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
}