//18. W.A.P to check whether given number is even or odd Without using % operator.
package csassignment2;

import java.util.Scanner;

public class P33 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);

        System.out.print(" enter a Number : ");
        int n = kb.nextInt();


        if((n & 1)==0)
            System.out.println("The Number "+n+ " is a Even Number");
        else
            System.out.println("The Number "+n+ " is a Odd  Number");
    }
}
