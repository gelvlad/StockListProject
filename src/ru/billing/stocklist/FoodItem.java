package ru.billing.stocklist;

import java.util.Date;

public class FoodItem extends GenericItem {
    private Date dateOfIncome;

    public Date getDateOfIncome() {
        return dateOfIncome;
    }

    public void setDateOfIncome(Date dateOfIncome) {
        this.dateOfIncome = dateOfIncome;
    }

    private short expires;

    public short getExpires() {
        return expires;
    }

    public void setExpires(short expires) {
        this.expires = expires;
    }

    public FoodItem(String name, float price, FoodItem analog, Date date, short expires) {
        super(name, price, Category.FOOD, analog);
        this.setDateOfIncome(date);
        this.setExpires(expires);
    }

    public FoodItem(String name, float price, short expires) {
        this(name, price, null, null, expires);
    }

    public FoodItem(String name) {
        this(name, 0, null, null, (short)0);
    }

    public FoodItem() {
        this("", 0, null, null,(short)0);
    }

    public String toString() {
        return super.toString() + String.format(", date of income: %tD, expires: %d\n", dateOfIncome, expires);
    }
}