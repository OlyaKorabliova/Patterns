package com.company;

/**
 * Created by Olia on 08.01.2017.
 */
public class SIMCardAdapter implements SIMCard{
    public BiggerSIMCard biggerSIMCard;

    public SIMCardAdapter(String cardType){
        if (cardType.equalsIgnoreCase("micro")) {
            biggerSIMCard = new MicroSIM();
        }
        else if (cardType.equalsIgnoreCase("mini")) {
            biggerSIMCard = new MiniSIM();
        }
    }

    @Override
    public void use(String cardType, String nameOfOperator) {
        if (cardType.equalsIgnoreCase("micro")) {
            biggerSIMCard.useMicroSIM(nameOfOperator);
        }
        else if (cardType.equalsIgnoreCase("mini")) {
            biggerSIMCard.useMiniSIM(nameOfOperator);
        }
    }
}
