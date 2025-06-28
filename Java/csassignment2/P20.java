// // Bitwise ^ operator
//5. WAP to exchange value of two variable without using third variable and arithmetic operator
package csassignment2;

import java.util.Scanner;

public class P20 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter the value of a : ");
        int a = kb.nextInt();

        System.out.print("Enter the value of b : ");
        int b = kb.nextInt();

        System.out.println("Before the exchange the value of a = " + a + " is b is = " + b);

//        a = a + b;
//        b = a - b;
//        a = a - b;

//        a=a*b;
//        b=a/b;
//        a=a/b;

        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println("after the exchange the value of a = " + a + " is b is = " + b);
    }
}
