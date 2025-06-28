//50) WAP to find out all the palindrome numbers between two entered numbers
package controlstatement;

import java.util.Scanner;

public class P50 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        System.out.print("Enter two Number : ");
        int a = kb.nextInt();
        int b = kb.nextInt();
        if (a <= b) {
            System.out.println(" all the palindrome numbers between two entered numbers " + a + " and " + b + " are given below.");
            for (int i = a; i <= b; i++) 
            {
                int rev=0,temp=i;
                for (rev=0; temp!=0; temp=temp/10)
                {
                    rev=rev*10+temp%10;
                }
                if(i==rev)
                    System.out.print(i+" is a the palindrome number.");
                else
                    System.out.print(i+" is not a the palindrome numbers .");
                System.out.println();
            }
        } else {
            System.out.println(" all the palindrome numbers between two entered numbers " + b + " and " + a + "are given below.");

           for (int i = b;i<=a; i++)
            {
                int rev=0,temp=i;
                for (rev=0; temp!=0; temp=temp/10)
                {
                    rev=rev*10+temp%10;
                }
                if(i==rev)
                    System.out.print(i+" is a the palindrome number.");
                else
                    System.out.print(i+" is not a the palindrome numbers .");
                System.out.println();
            }
        }
    }
}
