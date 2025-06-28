//    1
//   11
//  1*1
// 1**1
//11111
package controlstatement.pattern;

import java.util.Scanner;

public class P47 {

    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a number of rows : ");
        int rows = kb.nextInt();

        System.out.print("Enter a number of columns : ");
        int columns = kb.nextInt();

        for (int i = 1; i<=rows; i++)
        {
            for (int j = 1; j <= rows-i; j++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++)
            {
                if(i==j || i==5||j==1)
                    System.out.print("1");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}