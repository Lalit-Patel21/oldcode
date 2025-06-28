//1. WAP to calculate area of circle
package csassignment2;

import java.util.Scanner;

public class P16 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter the Radius of Circle : ");
        int rad = kb.nextInt();

        System.out.print("Area of Circle is : "+(Math.PI*rad*rad));
    }
}
