package ItemTypes;

import interfaces.*;

public abstract class AbstractItem implements Item, Categorizable, Breakable, Perishable, Sellable {

    private String category;
    private boolean fragile;
    private String itemDetails;
    private String description;
    private boolean decayable;
    private double price;
    @Override
    public boolean isBreakable() {
        return this.fragile;
    }

    @Override
    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String getCategory() {
        return  this.category;
    }

    @Override
    public String getItemDetails() {
        return this.itemDetails;
    }

    @Override
    public double calculateValue() {
        return 0;
    }

    @Override
    public void displayItemDescription() {
        System.out.println(description);
    }

    @Override
    public boolean isPerishable() {
        return this.decayable;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }
}
