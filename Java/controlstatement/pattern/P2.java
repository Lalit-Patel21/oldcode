//*
//*
//*
//*
//*
package controlstatement.pattern;

import java.util.Scanner;

public class P2 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = kb.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("*");
        }
    }
}
