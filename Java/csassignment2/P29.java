//14. WAP to find lowest number among four different number
package csassignment2;

import java.util.Scanner;

public class P29 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter the four number : ");
        int a = kb.nextInt();
        int b = kb.nextInt();
        int c = kb.nextInt();
        int d = kb.nextInt();

        if ((a < b) && (a < c) && (a < d)) {
            System.out.println(a + " is lowest number ");
        } else if ((b < a) && (b < c) && (b < d)) {
            System.out.println(b + " is lowest number ");
        } else if ((c < a) && (c < b) && (c < d)) {
            System.out.println(c + " is lowest number ");
        } else if ((d < a) && (d < b) && (d < c)) {
            System.out.println(d + " is lowest number ");
        } else {
            System.out.println(a + " all are equal number");
        }
    }
}
