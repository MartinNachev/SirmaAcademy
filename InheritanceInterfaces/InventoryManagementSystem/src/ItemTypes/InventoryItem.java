package ItemTypes;

public class InventoryItem extends AbstractItem {

    private static int idGenerator = 1;
    private final int id;
    private int quantity;

    public InventoryItem(String product, String category, boolean breakable,
                         boolean perishable, double price,String description, int quantity) {
        super(product, category, breakable, perishable, price, description);
        id = idGenerator;
        idGenerator++;
        setQuantity(quantity);
    }

    public int getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    private void setQuantity(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity can not be zero");
        }
        this.quantity = quantity;
    }

    @Override
    public String getItemDetails() {
        super.getItemDetails();
        details.append("product id: ").append(id).append("\n");
        details.append("quantity in stock: ").append(quantity).append("\n");
        return details.toString();
    }

    @Override
    public double calculateValue() {
        return this.getQuantity()*this.getPrice();
    }
}
