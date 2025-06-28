//    A
//   AB
//  ABC
// ABCD
//ABCDE

package controlstatement.pattern;

import java.util.Scanner;

public class P46 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a number of rows : ");
        int rows = kb.nextInt();

        System.out.print("Enter a number of columns : ");
        int columns = kb.nextInt();

        for (int i = 1; i<=rows; i++)
        {
            char ch='A';
            for (int j = 1; j <= rows-i; j++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++)
            {

                System.out.print(ch++);
            }
            System.out.println();
        }
    }
}

