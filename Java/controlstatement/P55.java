//55) WAP to print all the odd numbers between two entered numbers
package controlstatement;

import java.util.Scanner;

public class P55 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a two numbers : ");
        int a = kb.nextInt();
        int b = kb.nextInt();

        if (a <= b)
        {
            System.out.println("all the odd numbers between two entered numbers " + a + " and " + b + " are given below.");
            for (int i = a; i <= b; i++)
            {
                if(i%2==1)
                    System.out.print(i+" ");
            }
            System.out.println();
        }
        else {
            System.out.println("all the odd numbers between two entered numbers " + a + " and " + b + " are given below.");
            for (int i = b; i <=a; i++)
            {
                if(i%2==0)
                    System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
