//53) WAP to print all the strong numbers between two entered numbers
package controlstatement;

import java.util.Scanner;

public class P53 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a two numbers : ");
        int a = kb.nextInt();
        int b = kb.nextInt();

        if (a <= b) {
            System.out.println("all the strong numbers between two entered numbers " + a + " and " + b + " are given below.");
            for (int i = a; i <= b; i++) {

                int m=i,temp;
                long fact,str=0;

                while (m != 0) {

                    temp=m % 10;
                    fact=1;
                    while(temp!=1)
                    {
                        fact=fact*temp--;
                    }
                    str=str+fact;
                    m = m / 10;
                }
                if(i==str)
                {
                    System.out.println(i+" is a strong number");
                }
                else {
                    System.out.println(i+" is not a strong number");
                }

            }
            System.out.println();
        }
        else {
            System.out.println("all the strong numbers between two entered numbers " + a + " and " + b + " are given below.");
            for (int i = b; i <= a; i++) {

                int m=i,temp;
                long fact,str=0;

                while (m != 0) {

                    temp=m % 10;
                    fact=1;
                    while(temp!=1)
                    {
                        fact=fact*temp--;
                    }
                    str=str+fact;
                    m = m / 10;
                }
                if(i==str)
                {
                    System.out.println(i+" is a strong number");
                }
                else {
                    System.out.println(i+" is not a strong number");
                }

            }
            System.out.println();
        }
    }
}
