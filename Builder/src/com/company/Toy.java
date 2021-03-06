package com.company;

/**
 * Created by Olia on 08.01.2017.
 */
public abstract class Toy implements ToyItem {
    @Override
    public Packing packing() {
        return new WrappingPaper();
    }

    @Override
    public abstract float price();
}
