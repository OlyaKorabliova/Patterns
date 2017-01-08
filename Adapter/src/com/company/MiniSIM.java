package com.company;

/**
 * Created by Olia on 08.01.2017.
 */
public class MiniSIM implements BiggerSIMCard {

    @Override
    public void useMiniSIM(String nameOfOperator) {
        System.out.println("You use Mini SIM Card");
    }

    @Override
    public void useMicroSIM(String nameOfOperator) {
        //do nothing
    }
}
