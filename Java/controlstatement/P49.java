//49) WAP to find out all the perfect numbers between two entered numbers
package controlstatement;

import java.util.Scanner;

public class P49 {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        System.out.print("Enter two Number : ");
        int a = kb.nextInt();
        int b = kb.nextInt();
        if (a <= b) {
            System.out.println("all the perfect numbers between two entered numbers " + a + " and " + b + " are given below.");
            for (int i = a; i <= b; i++) {
                int sum=0;
                for (int j = 1; j <= i/2; j++) {
                    if(i%j==0)
                        sum=sum+j;
                }
                if(sum==i)
                    System.out.print(i+" is a perfect number.");
                else
                    System.out.print(i+" is not a perfect number.");
                System.out.println();
            }
        } else {
            System.out.println(" all the perfect numbers between two entered numbers " + b + " and " + a + "are given below.");

            for (int i = b; i <= a; i++)
            {
                int sum=0;
                for (int j = 1; j <= i/2; j++) {
                    if(i%j==0)
                        sum=sum+j;
                }
                if(sum==i)
                    System.out.print(i+" is a perfect number.");
                else
                    System.out.print(i+" is not a perfect number.");
                System.out.println();
            }
        }
    }
}
