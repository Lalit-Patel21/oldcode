
package controlstatement.pattern;

import java.util.Scanner;

public class P6 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a number of rows : ");
        int rows = kb.nextInt();

        System.out.print("Enter a number of columns : ");
        int columns = kb.nextInt();

        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= columns; j++)
            {

                System.out.print(i);
            }
            System.out.println();
        }

    }
}
