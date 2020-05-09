package task6;

import java.util.ArrayList;
import java.util.List;

public class BestItemSearch {

    public static int calcItemsWeight(List<Item> items) {

        int itemsWeight = 0;

        for (Item item : items) {
            itemsWeight += item.getWeight();

        }

        return itemsWeight;
    }

    public static int calcItemsCost(List<Item> items) {

        int itemsCost = 0;

        for (Item item : items) {
            itemsCost += item.getCost();
        }

        return itemsCost;
    }

    public static void checkItemsForBackPack(List<Item> items, Backpack backpack) {
        if (backpack.getBestItems() == null) {
            if (calcItemsWeight(items) <= backpack.getMaxWeight()) {
                backpack.setBestItems(items);
                backpack.setBestPrice(calcItemsCost(items));
            }
        } else {
            if (calcItemsWeight(items) <= backpack.getMaxWeight() && calcItemsCost(items) > backpack.getBestPrice()) {
                backpack.setBestItems(items);
                backpack.setBestPrice(calcItemsCost(items));
            }
        }
    }

    public static void countBestSet(List<Item> items, Backpack backpack) {
        if (items.size() > 0) {
            checkItemsForBackPack(items, backpack);
        }

        for (int i = 0; i < items.size(); i++) {

            List<Item> itemBest = new ArrayList<>(items);
            itemBest.remove(i);
            countBestSet(itemBest, backpack);
        }
    }

}
