//17. W.A.P to check the sign of given number.
package csassignment2;

import java.util.Scanner;

public class P32 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);

        System.out.print(" enter a Number : ");
        int n = kb.nextInt();

        if(n>0)
         System.out.println("The sign of "+n+ " is Positive");
        else if(n<0)
            System.out.println("The sign of "+n+ " is Negative");
        else
            System.out.println("The Zero is Exception ");

    }
}
