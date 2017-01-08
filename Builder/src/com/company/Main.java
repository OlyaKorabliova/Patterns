package com.company;


public class Main {

    public static void main(String[] args) {
	// write your code here
        PresentBuilder presentBuilder = new PresentBuilder();

        Present forGirl = presentBuilder.makePresentForGirl();
        System.out.println("For Girl: ");
        forGirl.showItems();
        System.out.println("Total Cost: " + Math.round(forGirl.getCost() * 100.0) / 100.0 + "\n");

        Present forBoy = presentBuilder.makePresentForBoy();
        System.out.println("For Boy: ");
        forBoy.showItems();
        System.out.println("Total Cost: " + Math.round(forBoy.getCost() * 100.0) / 100.0 + "\n");

    }
}
