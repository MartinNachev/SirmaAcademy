package ItemTypes;

import interfaces.*;

public abstract class AbstractItem implements Item, Categorizable, Breakable, Perishable, Sellable {

    private String category;
    private boolean breakable;
    private String description;
    private boolean perishable;
    private double price;

    protected AbstractItem(String category, boolean breakable, String description, boolean perishable, double price) {
        this.category = category;
        this.breakable = breakable;
        this.description = description;
        this.perishable = perishable;
        this.setPrice(price);
    }

    public void setBreakable(boolean breakable){
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
    public double calculateValue() {
        return 0;
    }

    public void setDescription(String description) {
        this.description = description;
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
}
