//9) WAP to print N even numbers.
package controlstatement;

import java.util.Scanner;

public class P9 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter value of N: ");
        int n = kb.nextInt();

        System.out.println( n +" Even Number are given below: ");

        int i = 2;
        while (n!=0) {
               System.out.print(i+" ");
               i=i+2;
               n--;
        }
    }
}
