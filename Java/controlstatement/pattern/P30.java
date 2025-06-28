package controlstatement.pattern;

import java.util.Scanner;

public class P30 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a number of rows : ");
        int rows = kb.nextInt();

        System.out.print("Enter a number of columns : ");
        int columns = kb.nextInt();

//        for (int i = 1; i <= 5; i++)
//        {
//            for (int j = 5;j >=i;j--)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        for (int i = rows; i >= 1; i--)
        {
            for (int j = 1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
