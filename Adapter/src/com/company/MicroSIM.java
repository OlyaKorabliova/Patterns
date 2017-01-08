package com.company;

/**
 * Created by Olia on 08.01.2017.
 */
public class MicroSIM implements BiggerSIMCard {
    @Override
    public void useMiniSIM(String nameOfOperator) {
        //do nothing
    }

    @Override
    public void useMicroSIM(String nameOfOperator) {
        System.out.println("You use Micro SIM Card");
    }
}
