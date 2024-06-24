package ItemTypes;

public class InventoryItem extends AbstractItem {
    private int id;
    private int quantity;
    protected final StringBuilder details = new StringBuilder();

    public InventoryItem(String category,boolean breakable, String description,
                         boolean perishable,double price,int id, int quantity){
        super(category, breakable, description, perishable, price);
        setId(id);
        setQuantity(quantity);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id<=0){
            throw new IllegalArgumentException("id can not be zero or negative");
        }
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity<0){
            throw new IllegalArgumentException("Quantity can not be zero");
        }
        this.quantity = quantity;
    }

    @Override
    public String getItemDetails() {
        details.append("id: ").append(id).append("\n")
                .append("quantity: ").append(quantity).append("\n")
                .append("price: ").append(getPrice()).append("\n")
                .append("category: ").append(getCategory()).append("\n")
                .append("fragile: ").append(isBreakable()).append("\n")
                .append("perishable: ").append(isPerishable()).append("\n");
        return details.toString();
    }
}
