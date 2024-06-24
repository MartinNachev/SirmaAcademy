package ItemTypes;

import interfaces.*;

public abstract class AbstractItem implements Item, Categorizable, Breakable, Perishable, Sellable {

    private String product;
    private String category;
    private boolean breakable;
    private boolean perishable;
    private double price;
    private String description;

    protected  StringBuilder details;

    protected AbstractItem(String product, String category, boolean breakable, boolean perishable,
                           double price,String description) {
        this.product = product;
        this.category = category;
        this.breakable = breakable;
        this.perishable = perishable;
        this.description = description;
        this.setPrice(price);
    }


    protected void setBreakable(boolean breakable){
        this.breakable = breakable;
    }
    @Override
    public boolean isBreakable() {
        return breakable;
    }

    @Override
    public void breakItem() {

    }

    @Override
    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String getCategory() {
        return category;
    }

    @Override
    public void displayItemDescription() {
        System.out.println(description);
    }

    public void setPerishable(boolean perishable) {
        this.perishable = perishable;
    }

    @Override
    public boolean isPerishable() {
        return perishable;
    }

    @Override
    public void perishedItem() {

    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        if (price <= 0){
            throw new IllegalArgumentException("Price can not be zero or negative!");
        }
        this.price = price;
    }

    public String getItemDetails(){
        details = new StringBuilder();
        details.append("product: ").append(product).append("\n")
                .append("category: ").append(category).append("\n")
                .append("fragile: ").append(breakable).append("\n")
                .append("perishable: ").append(perishable).append("\n")
                .append("price: ").append(price).append("\n")
                .append("description: ").append(description).append("\n");

          return details.toString();
    }
}
