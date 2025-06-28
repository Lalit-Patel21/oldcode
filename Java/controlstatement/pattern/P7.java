
package controlstatement.pattern;

import java.util.Scanner;

public class P7 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a number of rows : ");
        int rows = kb.nextInt();

        System.out.print("Enter a number of columns : ");
        int columns = kb.nextInt();

        for (int i = 1; i <=rows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                if(i%2==0)
                    System.out.print("0");
                else
                    System.out.print("1");
            }
            System.out.println();
        }
    }
}
