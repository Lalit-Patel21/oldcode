//6. WAP to find greater among two number
package csassignment2;

import java.util.Scanner;

public class P21 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter the two number : ");
        int a = kb.nextInt();
        int b = kb.nextInt();

        if (a > b) {
            System.out.println(a + " is greater");
        } else if (b > a) {
            System.out.println(b + " is greater");
        } else {
            System.out.println(a + " " + b + " both are equal");
        }
    }
    }
