//11) WAP to print N odd numbers.
package controlstatement;

import java.util.Scanner;

public class P11 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter value of N: ");
        int n = kb.nextInt();

        System.out.println( n +" Odd Number are given below: ");

        int i = 1;
        while (n!=0) {
            System.out.print(i+" ");
            i=i+2;
            n--;
        }
    }
}
