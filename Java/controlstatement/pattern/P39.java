//1 2 3 4 5 6
//5 4 3 2 1
//1 2 3 4
//3 2 1 
//1 2
//1
package controlstatement.pattern;

import java.util.Scanner;

public class P39 {
    public static void main(String[] args) {
//        Scanner kb = new Scanner(System.in);
//
//        System.out.print("Enter a number of rows : ");
//        int rows = kb.nextInt();
//
//        System.out.print("Enter a number of columns : ");
//        int columns = kb.nextInt();

        int k;
        for (int i = 6; i >= 1; i--)
        {
            k = i;
            for (int j = 1; j <= i; j++)
            {
                if (i % 2 == 0)
                    System.out.print(j + " ");
                else
                    System.out.print((k--) + " ");
            }
            System.out.println();
        }
    }
}
