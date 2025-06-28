//2. WAP to calculate area of rectangle
package csassignment2;

import java.util.Scanner;

public class P17 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter Length of a rectangle is : ");
        int len = kb.nextInt();

        System.out.print("Enter Breadth of a rectangle is : ");
        int br = kb.nextInt();

        System.out.print("Area of a rectangle is : "+(len*br));
    }
}
