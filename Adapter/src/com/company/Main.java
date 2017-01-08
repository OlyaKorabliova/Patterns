package com.company;

/**
 * Created by Olia on 08.01.2017.
 */
public class Main {
    public static void main(String[] args){
        SIMCardUser simCardUser = new SIMCardUser();
        simCardUser.use("nano", "LifeCell");
        simCardUser.use("micro", "MTC");
        simCardUser.use("maxi", "KS");
        simCardUser.use("mini", "Vodafone");
    }
}
