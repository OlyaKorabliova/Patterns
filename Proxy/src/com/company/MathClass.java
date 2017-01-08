package com.company;

/**
 * Created by Olia on 08.01.2017.
 */
public class MathClass implements IMath {
    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public double division(int a, int b) {
        return (double)a / b;
    }
}
