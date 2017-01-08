package com.company;

/**
 * Created by Olia on 08.01.2017.
 */
public class Chocolates extends Sweet {
    @Override
    public String name() {
        return "Chocolates";
    }

    @Override
    public float price() {
        return 132.60f;
    }
}
