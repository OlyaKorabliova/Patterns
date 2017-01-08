package com.company;

/**
 * Created by Olia on 08.01.2017.
 */
public abstract class Sweet implements ToyItem{

    @Override
    public Packing packing() {
        return new Carton();
    }

    @Override
    public abstract float price();
}
