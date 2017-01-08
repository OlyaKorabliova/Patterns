package com.company;

/**
 * Created by Olia on 08.01.2017.
 */
public class Cake extends Sweet {
    @Override
    public String name() {
        return "Cake";
    }

    @Override
    public float price() {
        return 100.99f;
    }
}
