import ItemTypes.InventoryItem;

public class InventoryManager {
    public InventoryManager(){

    }
    public void addItem(ItemRepository itemRepository, InventoryItem item){
        itemRepository.getItemRepository().putIfAbsent(item.getId(), item);
    }
    public void removeItemById(ItemRepository itemRepository,int itemId){
        itemRepository.getItemRepository().remove(itemId);
    }
}
