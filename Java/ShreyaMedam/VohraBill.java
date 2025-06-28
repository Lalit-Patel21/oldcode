package ShreyaMedam;


import java.util.Scanner;

public class VohraBill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of pizzas bought:");
        int pizzas = sc.nextInt();

        System.out.print("Enter the no of puffs bought:");
        int puffs = sc.nextInt();

        System.out.print("Enter the no of cool drinks bought:");
        int coolDrinks = sc.nextInt();

        System.out.println();
        System.out.println("__________________________________________________");
        System.out.println("\t\t\t\tBill Details");
        System.out.println("__________________________________________________");

        System.out.println("the no of pizzas bought :\t\t "+pizzas);
        System.out.println("he no of puffs bought   :  \t\t   "+puffs);
        System.out.println("the no of cool drinks bought :\t "+coolDrinks);
        System.out.println("___________________________________________________");

        System.out.println("Total Price \t\t\t\t=   "+(pizzas*100+ puffs*20+ coolDrinks*10)+" Rs");

        System.out.println("___________________________________________________");

    }
}