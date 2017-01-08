package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Olia on 08.01.2017.
 */
public class Present {
    private List<ToyItem> items = new ArrayList<ToyItem>();

    public void addItem(ToyItem item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;
        for (ToyItem i : items) {
            cost += i.price();
        }
        return cost;
    }

    public void showItems() {
        for (ToyItem i : items) {
            System.out.println("~Toy: " + i.name());
            System.out.println("~Packing: " + i.packing().pack());
            System.out.println("~Price: " + i.price() + "\n");

        }
    }
}
