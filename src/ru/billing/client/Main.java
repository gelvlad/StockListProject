package ru.billing.client;

import ru.billing.stocklist.Category;
import ru.billing.stocklist.FoodItem;
import ru.billing.stocklist.GenericItem;
import ru.billing.stocklist.ItemCatalog;

import java.util.Date;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Integer[] IntArr = {10, 20, 15};

        Float[] floatArr = new Float[10];
        for (int i = 0; i < floatArr.length; i++) {
            floatArr[i] = 10 / ((float)i + 1);
        }

        WorkArray<Integer> insWorkArrayInt = new WorkArray<>(IntArr);
        WorkArray<Float> insWorkArrayFloat = new WorkArray<>(floatArr);
        System.out.println(insWorkArrayInt.sum());
        System.out.println(insWorkArrayFloat.sum());

        String line = "Конфеты ’Маска’;45;120";
        String[] item_fld = line.split(";");
        FoodItem item = new FoodItem(item_fld[0], Float.parseFloat(item_fld[1]), Short.parseShort(item_fld[2]));
        item.printAll();

        ItemCatalog catalog = new ItemCatalog();

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            catalog.addItem(new GenericItem(
                    String.format("item num %s", i + 1),
                    random.nextFloat() * 100,
                    Category.GENERAL));
        }

        long begin = new Date().getTime();
        for(int i = 0; i < 10000000; i++) {
            catalog.findItemByID(10);
        }
        long end = new Date().getTime();
        System.out.println("In HashMap: " + (end - begin));

        begin = new Date().getTime();
        for(int i = 0; i < 10000000; i++) {
            catalog.findItemByIDAL(10);
        }
        end = new Date().getTime();
        System.out.println("In ArrayList: " + (end - begin));

        catalog = new ItemCatalog();
        CatalogLoader loader = new CatalogStubLoader();
        loader.load(catalog);
        catalog.printItems();
    }
}
