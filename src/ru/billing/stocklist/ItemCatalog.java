package ru.billing.stocklist;

import java.util.ArrayList;
import java.util.HashMap;

public class ItemCatalog {
    private HashMap<Integer, GenericItem> catalog = new HashMap<Integer, GenericItem>();

    public HashMap<Integer, GenericItem> getCatalog() {
        return catalog;
    }

    private void setCatalog(HashMap<Integer, GenericItem> catalog) {
        this.catalog = catalog;
    }

    private ArrayList<GenericItem> ALCatalog = new ArrayList<GenericItem>();

    public ArrayList<GenericItem> getALCatalog() {
        return ALCatalog;
    }

    private void setALCatalog(ArrayList<GenericItem> ALCatalog) {
        this.setALCatalog(ALCatalog);
    }

    public void addItem(GenericItem item) {
        catalog.put(item.getID(), item);
        ALCatalog.add(item);
    }

    public void printItems() {
        for (GenericItem i : ALCatalog) {
            System.out.println(i);
        }
    }

    public GenericItem findItemByID(int id) {
        return catalog.getOrDefault(id, null);
    }

    public GenericItem findItemByIDAL(int id) {
        for(GenericItem i : ALCatalog){
            if(i.getID() == id) return i;
        }
        return null;
    }
}