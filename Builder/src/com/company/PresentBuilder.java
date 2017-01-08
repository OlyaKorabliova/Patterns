package com.company;

/**
 * Created by Olia on 08.01.2017.
 */
public class PresentBuilder {
    public Present makePresentForGirl() {
        Present present = new Present();
        present.addItem(new Barbie());
        present.addItem(new Chocolates());
        return present;
    }

    public Present makePresentForBoy() {
        Present present = new Present();
        present.addItem(new Ferrari());
        present.addItem(new Cake());
        return present;
    }
}
