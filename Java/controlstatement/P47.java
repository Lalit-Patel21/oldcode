//47) WAP to print tables of all the numbers between two entered numbers
package controlstatement;

import java.util.Scanner;

public class P47 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        System.out.println("Enter two Number : ");
        int a = kb.nextInt();
        int b = kb.nextInt();

        if (a <= b) {
            System.out.println("the tables of all the numbers between two entered numbers"+a +" and "+b+ "are given below.");

            for (int i = a; i <= b; i++)
            {
                for (int j = 1; j <= 10; j++)
                {
                    System.out.print(j+"*"+i+"="+(j*i)+" ");

                }
                System.out.println();
            }
        }else {
            System.out.println("the tables of all the numbers between two entered numbers"+b +" and "+a+ " are given below.");
            for (int i = b; i <= a; i++)
            {
                for (int j = 1; j <= 10; j++)
                {
                    System.out.print(i+"*"+j+"="+(j*i)+" ");
                }
                System.out.println();
            }

        }
    }
}
