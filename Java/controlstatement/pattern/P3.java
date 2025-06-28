/*
*
 *
  *
   *
    *  
 */
package controlstatement.pattern;

import java.util.Scanner;

public class P3 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = kb.nextInt();

//        for (int i = 0; i < n; i++)
//        {
//            for (int j = 0; j <= i-1; j++)
//            {
//
//                System.out.print(" ");
//            }
//            System.out.println("*");
//        }

        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                if(i==j)
                    System.out.print("*");
                else
                    System.out.print(" ");

            }
            System.out.println();
        }
    }
}
