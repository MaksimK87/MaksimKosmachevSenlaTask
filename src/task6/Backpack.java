package task6;

import java.util.List;
import java.util.Objects;

public class Backpack {

    private int maxWeight;
    private List<Item> bestItems;
    private int bestPrice;

    public Backpack(int maxWeight) {
        this.maxWeight =maxWeight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public List<Item> getBestItems() {
        return bestItems;
    }

    public void setBestItems(List<Item> bestitems) {
        this.bestItems = bestitems;
    }

    public int getBestPrice() {
        return bestPrice;
    }

    public void setBestPrice(int bestPrice) {
        this.bestPrice = bestPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Backpack backpack = (Backpack) o;
        return maxWeight == backpack.maxWeight &&
                bestPrice == backpack.bestPrice &&
                Objects.equals(bestItems, backpack.bestItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxWeight, bestItems, bestPrice);
    }

    @Override
    public String toString() {
        return "Backpack{" +"\n"+
                "maxWeight=" + maxWeight +"\n"+
                "bestItems=" + bestItems +"\n"+
                "bestPrice=" + bestPrice +
                '}';
    }
}
