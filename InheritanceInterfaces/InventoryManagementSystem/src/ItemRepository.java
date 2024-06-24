import ItemTypes.InventoryItem;

import java.util.LinkedHashMap;

public class ItemRepository {
    LinkedHashMap<Integer, InventoryItem> itemRepository;

    public ItemRepository() {
        itemRepository = new LinkedHashMap<>();
    }

    public LinkedHashMap<Integer, InventoryItem> getItemRepository() {
        return itemRepository;
    }
}
