//36) WAP to reverse a number
package controlstatement;

import java.util.Scanner;

public class P36 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = kb.nextInt();

        System.out.print("Reverse number of " + n + " is : ");

        int count = 0,rev=0;
        while (n != 0) {

            rev=rev*10+n%10;
            n = n / 10;

        }
        System.out.print(rev);
    }
}
