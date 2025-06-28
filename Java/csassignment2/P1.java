//1. Take values of length and breadth of a rectangle from user and check if it is square or not.
package csassignment2;

import java.util.Scanner;

public class P1 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter Length of a rectangle is : ");
        int len = kb.nextInt();

        System.out.print("Enter Breadth of a rectangle is : ");
        int br = kb.nextInt();

        if(len==br)
            System.out.print("It is a square");
        else
            System.out.print("It is not a square");
    }
}

