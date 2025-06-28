//21. Java program to check whether the triangle is valid or not if angles are given.
// Hint:- The angle property of the triangle says that the sum of all three angles should be equal to 180.
package csassignment2;

import java.util.Scanner;

public class P36 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Enter the three angles of a triangle :");
        int a = kb.nextInt();
        int b = kb.nextInt();
        int c = kb.nextInt();

        if(a+b+c==180)
        {
            System.out.println("the triangle is valid triangle");
        }
        else
        {
            System.out.println("the triangle is not a valid triangle ");
        }
    }
}
