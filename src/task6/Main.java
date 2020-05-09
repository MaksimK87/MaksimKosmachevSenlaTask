package task6;

import java.util.ArrayList;
import java.util.List;

/*6.	Имеется набор вещей, которые необходимо поместить в рюкзак.
Рюкзак обладает заданной грузоподъемностью. Вещи в свою очередь обладают двумя параметрами —
весом и стоимостью. Цель задачи заполнить рюкзак не превысив его грузоподъемность и
максимизировать суммарную ценность груза.*/

public class Main {
    public static void main(String[] args) {

        List<Item> items=new ArrayList<>();

        Backpack backpack=new Backpack(15);


        items.add(new Item("Notebook",6,5));
        items.add(new Item("Jacket ",4,3));
        items.add(new Item("Book",3,1));
        items.add(new Item("Kettle",2,3));
        items.add(new Item("Phone",5,6));

        System.out.println("Items quantity: "+items.size()+"\n"+"Items: "+items+ "\n");

        BestItemSearch.countBestSet(items,backpack);

        System.out.println("The best set for backpack: "+backpack);
        System.out.println("Current weight of backpack with items: "+(BestItemSearch.calcItemsWeight(backpack.getBestItems())));
    }
}
