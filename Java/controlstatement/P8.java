//8) WAP to print Fibonacci series.
package controlstatement;

import java.util.Scanner;

public class P8 {
        public static void main(String []args) {
            Scanner kb = new Scanner(System.in);

            System.out.print("Enter a number of term you want to print Fibonacci Series : ");
            int n = kb.nextInt();

            System.out.println("Fibonacci Series of " + n + " term are given below: ");

            int i = 1,a=-1,b=1,sum;
            while (i <= n) {

                    sum=a+b;
                    System.out.print(sum+" ");
                    a=b;
                    b=sum;
                    i++;
            }
        }
    }

