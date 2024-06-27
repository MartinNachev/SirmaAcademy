import ItemTypes.InventoryItem;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Order {
    private LinkedHashMap<ItemRepository, Integer> cart;
    private double totalPrice;

    public Order() {
        cart = new LinkedHashMap<>();
    }
    public void addItem(ItemRepository itemRepository,int id, int quantity){

    }
}
