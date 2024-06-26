import ItemTypes.InventoryItem;

import java.util.LinkedHashMap;
import java.util.Set;

public class ItemRepository {
    LinkedHashMap<String, LinkedHashMap<Integer,InventoryItem>> itemRepository;

    public ItemRepository() {
        itemRepository = new LinkedHashMap<>();
    }

    public  LinkedHashMap<String, LinkedHashMap<Integer,InventoryItem>> getItemRepository(){
        return itemRepository;
    }
}
