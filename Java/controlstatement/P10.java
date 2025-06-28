 //10) WAP to print Even numbers up to N.
package controlstatement;

import java.util.Scanner;

    public class P10 {
        public static void main(String []args) {
            Scanner kb = new Scanner(System.in);

            System.out.print("Enter a number up to where  you want to print Even Number: ");
            int n = kb.nextInt();

            System.out.println("Even Number Up to " + n + " are given below: ");

            int i = 1;
            while (i <= n) {
                if(i%2==0)
                    System.out.print(i+" ");
                i++;
            }
        }
    }


