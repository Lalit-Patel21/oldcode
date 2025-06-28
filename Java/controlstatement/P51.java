//51) WAP to reverse all the numbers between two entered numbers
package controlstatement;

import java.util.Scanner;

public class P51 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        System.out.print("Enter two Number : ");
        int a = kb.nextInt();
        int b = kb.nextInt();
        if (a <= b) {
            System.out.println("reverse of all the numbers  between two entered numbers " + a + " and " + b + " are given below.");
            for (int i = a; i <= b; i++)
            {
                int rev=0,temp=i;
                for (rev=0; temp!=0; temp=temp/10)
                {
                    rev=rev*10+temp%10;
                }
                    System.out.print(" reverse of the "+i+ " is "+rev);
                System.out.println();
            }
        } else {
            System.out.println("reverse of all the numbers between two entered numbers " + b + " and " + a + "are given below.");
            for (int i = b;i<=a; i++)
            {
                int rev=0,temp=i;
                for (rev=0; temp!=0; temp=temp/10)
                {
                    rev=rev*10+temp%10;
                }
                System.out.print(" reverse of the "+i+ " is "+rev);
                System.out.println();
            }
        }
    }
}
