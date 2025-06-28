package assignment2;

import java.util.Scanner;

public class As3 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        int num,sumEv=0,sumOd=0;
        String choice;
        do {

            System.out.print("Enter the number : ");
            num = kb.nextInt();
            System.out.print("Do you want to continue y/n? : ");
            choice = kb.next();
            if (num % 2 == 0) {

                sumEv = sumEv + num;

            } else {

                sumOd = sumOd + num;

            }
        } while(choice.equalsIgnoreCase("y"));

        System.out.println("sum of even numbers : " + sumEv);
        System.out.println("sum of odd numbers : " + sumOd);
    }
}

