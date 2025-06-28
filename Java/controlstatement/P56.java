//56) WAP to print factorial of all the numbers between two entered numbers
package controlstatement;

import java.util.Scanner;

public class P56 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a two numbers : ");
        int a = kb.nextInt();
        int b = kb.nextInt();

        if (a <= b)
        {
            System.out.println("factorial of all the numbers between two entered numbers " + a + " and " + b + " are given below.");
            for (int i = a; i <= b; i++)
            {
                long fact = 1;
               for (int j=i;j>=1;j--){
                   fact=fact*j;
               }
                System.out.println("factorial of "+i+" number is "+fact);
            }
            System.out.println();
        }
        else {
            System.out.println("factorial of all the numbers between two entered numbers " + a + " and " + b + " are given below.");
            for (int i = b; i <=a; i++)
            {
                {
                    long fact = 1;
                    for (int j=i;j>=1;j--){
                        fact=fact*j;
                    }
                    System.out.println("factorial of "+i+" number is "+fact);
                }

            }
            System.out.println();
        }
    }
}
 