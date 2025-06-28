//48) WAP to find out the factors of all the numbers between two entered numbers
package controlstatement;

import java.util.Scanner;

public class P48 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        System.out.print("Enter two Number : ");
        int a = kb.nextInt();
        int b = kb.nextInt();
        if (a <= b) {
            System.out.println("the factors of all the numbers between two entered numbers " + a + " and " + b + " are given below.");
            for (int i = a; i <= b; i++) {
                System.out.print("factor of " + i + " are : ");
                for (int j = 1; j <= i/2; j++) {
                    if(i%j==0)
                        System.out.print(j+" ");
                }
                System.out.println();
            }
        } else {
            System.out.println("the factors of all the numbers between two entered numbers" + b + " and " + a + "are given below.");

            for (int i = b; i <= a; i++)
            {
                System.out.println("factor of " + i + " are : " );
                for (int j = 1; j <= i/2; j++)
                {
                    if(i%j==0)
                     System.out.print(j+" ");
                }
                System.out.println();
            }
        }
    }

}

