//9. WAP to check wheater number is positive or negative
package csassignment2;

import java.util.Scanner;

public class P24 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = kb.nextInt();


        if (n > 0) {
            System.out.println(n + " is Positive Number");
        } else if (n < 0) {
            System.out.println(n + " is Negative Number");
        } else {
            System.out.println("Number is Zero");
        }
    }
}
