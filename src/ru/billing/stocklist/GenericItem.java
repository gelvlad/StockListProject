package ru.billing.stocklist;

public class GenericItem {
    private static int currentID = 0;

    private int ID;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private float price;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    private GenericItem analog;

    public GenericItem getAnalog() {
        return analog;
    }

    public void setAnalog(GenericItem analog) {
        this.analog = analog;
    }

    private Category itemCategory;

    public Category getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(Category itemCategory) {
        this.itemCategory = itemCategory;
    }

    protected GenericItem(String name, float price, Category category, GenericItem analog) {
        this.setName(name);
        this.setPrice(price);
        this.setItemCategory(category);
        this.setAnalog(analog);
        this.setID(++currentID);
    }

    public GenericItem(String name, float price, Category category) {
        this(name, price, category, null);
    }

    public GenericItem(String name, float price, GenericItem analog) {
        this(name, price, Category.GENERAL, analog);
    }

    public GenericItem() {
        this("", 0, Category.GENERAL, null);
    }

    public void printAll() {
        System.out.println(this);
    }

    public String toString() {
        String res = String.format("ID: %d, Name: %s, price: %.2f, category: %s", ID, name, price, itemCategory);
        if (analog != null)
            res += String.format(", analog ID: %d", analog.ID);
        return res;
    }
}
