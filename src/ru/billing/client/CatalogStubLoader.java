package ru.billing.client;

import ru.billing.stocklist.Category;
import ru.billing.stocklist.FoodItem;
import ru.billing.stocklist.GenericItem;
import ru.billing.stocklist.ItemCatalog;

import java.util.Date;

public class CatalogStubLoader implements CatalogLoader {
    @Override
    public void load(ItemCatalog catalog) {
        GenericItem item1 = new GenericItem("Sony TV",23000, Category.GENERAL);
        FoodItem item2 = new FoodItem("Bread",12,null, new Date(), (short)10);
        catalog.addItem(item1);
        catalog.addItem(item2);
    }
}
