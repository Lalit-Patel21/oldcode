//60) WAP to print Square, Cube and Square Root of all numbers from 1 to N
package controlstatement;

import java.util.Scanner;

public class P60 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a numbers : ");
        int n = kb.nextInt();

        System.out.println("Square, Cube and Square Root of all numbers from 1 to " + n + " are are given below.");

        for (int i = 1; i <= n; i++) {
            System.out.println("Square of "+i+" is " + (i * i));
            System.out.println("Cube of "+i+" is "  + (i * i * i));
            System.out.println("Square Root of "+i+" is" + (Math.sqrt(i)));
        }
        System.out.println();
    }
}

