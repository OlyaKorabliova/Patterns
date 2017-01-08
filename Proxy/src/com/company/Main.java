package com.company;

/**
 * Created by Olia on 08.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        MathClass mathProxy = new ProxyMathClass();
        System.out.println("\t35/5 =");
        System.out.println(mathProxy.division(35, 5));
        System.out.println("\t35/4 =");
        System.out.println(mathProxy.division(35, 4));
        System.out.println("\t35 + 5 =");
        System.out.println(mathProxy.sum(35, 5));
        System.out.println("\t35/0 -> raise an exception!!");
        System.out.println(mathProxy.division(35, 0));

    }
}
