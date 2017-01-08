package com.company;

/**
 * Created by Olia on 08.01.2017.
 */
public class SIMCardUser implements SIMCard {
    public SIMCardAdapter simCardAdapter;

    @Override
    public void use(String cardType, String nameOfOperator) {
        if (cardType.equalsIgnoreCase("nano")) {
            System.out.println("You use Nano SIM Card");
        }
        else if (cardType.equalsIgnoreCase("micro") || cardType.equalsIgnoreCase("mini")) {
            simCardAdapter = new SIMCardAdapter(cardType);
            simCardAdapter.use(cardType, nameOfOperator);
        }
        else {
            System.out.println("Invalid SIM!");
        }
    }
}
