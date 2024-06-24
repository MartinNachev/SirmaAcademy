package ItemTypes;
public class ElectronicsItem extends InventoryItem {
    public static final boolean PERISHABLE = false;
    public static final boolean BREAKABLE = true;
    private String brand;
    private String model;

    public ElectronicsItem(String product, String category,
                           double price,String description, int quantity, String brand,String model) {

        super(product,category, BREAKABLE, PERISHABLE, price,description, quantity);
        this.brand = brand;
        this.model = model;

    }

    @Override
    public String getItemDetails() {
         super.getItemDetails();
         details.append("brand: ").append(brand).append("\n")
                .append("model: ").append(model).append("\n");
         return  details.toString();
    }
}
