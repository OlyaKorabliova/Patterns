package com.company;

/**
 * Created by Olia on 08.01.2017.
 */
public class ProxyMathClass extends MathClass implements IMath {
    public MathClass math;
    public ProxyMathClass(){}
    @Override
    public int sum(int a, int b) {
        if (math == null) {
            math = new MathClass();
        }
        return math.sum(a, b);
    }

    @Override
    public double division(int a, int b) {
        if (math == null) {
            math = new MathClass();
        }
        if (b != 0) {
            return math.division(a, b);
        }
        else {
            throw new IllegalArgumentException("Can't divide by zero!!");
        }
    }
}
