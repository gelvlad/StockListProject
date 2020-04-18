package ru.billing.stocklist;

public class TechnicalItem extends GenericItem {
    private short warrantyTime;

    public short getWarrantyTime() {
        return warrantyTime;
    }

    public void setWarrantyTime(short warrantyTime) {
        this.warrantyTime = warrantyTime;
    }

    @Override
    public void printAll() {
        super.printAll();
        System.out.printf(" , warranty time: %d\n", warrantyTime);
    }
}
