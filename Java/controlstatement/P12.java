
//12) WAP to print Odd numbers up to N.
package controlstatement;

import java.util.Scanner;

public class P12 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a number up to where  you want to print Odd Number: ");
        int n = kb.nextInt();

        System.out.println("Odd Number Up to " + n + " are given below: ");

        int i = 1;
        while (i <= n) {
            if(i%2==1)
                System.out.print(i+" ");
            i++;
        }
    }

}
