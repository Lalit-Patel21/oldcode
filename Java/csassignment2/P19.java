//4. WAP to exchange value to two variable with third variable and without third variable
package csassignment2;

import java.util.Scanner;

public class P19 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter the value of a : ");
        int a = kb.nextInt();

        System.out.print("Enter the value of b : ");
        int b = kb.nextInt();

        System.out.println("Before the exchange the value of a = "+a+" is b is = "+b);

        int temp;
        temp = a;
        a=b;
        b=temp;

        System.out.println("after the exchange the value of a = "+a+" is b is = "+b);
    }
}
