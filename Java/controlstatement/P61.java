//61) WAP to find out all the leap years between two entered years
package controlstatement;

import java.util.Scanner;

public class P61 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.print("Enter two years  : ");
        int m = kb.nextInt();
        int n = kb.nextInt();

        System.out.println("all the leap years between two entered years  " + m + "and " + n + " are are given below.");

        for (int i = m; i <= n; i++) {

        }
        System.out.println();
    }
}
