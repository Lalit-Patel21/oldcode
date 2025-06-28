//8. WAP to check wheather number is even or odd
package csassignment2;

import java.util.Scanner;

public class P23 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int n = kb.nextInt();

        if (n%2==0) {
            System.out.println(n + " is a Even Number");
        } else {
            System.out.println(n + " is a Odd Number");
        }
    }
}
