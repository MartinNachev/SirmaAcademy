package ItemTypes;
public class ElectronicsItem extends InventoryItem {

    private String productType;
    private String brand;
    private String model;

    public ElectronicsItem(String category, boolean breakable, String description,
                           boolean perishable, double price, int id, int quantity) {
        super(category, breakable, description, perishable, price, id, quantity);
    }

    @Override
    public String getItemDetails() {
        return super.getItemDetails() + details.append("product: ").append(productType).append("\n")
                .append("brand: ").append(brand).append("\n")
                .append("model: ").append(model).append("\n");
    }
}
