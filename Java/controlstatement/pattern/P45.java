//    5
//   44
//  333
// 2222
//11111

package controlstatement.pattern;

//import java.util.Scanner;

import java.util.Scanner;

public class P45 {
    public static void main(String []args)
    {
//        Scanner kb = new Scanner(System.in);
//
//        System.out.print("Enter a number of rows : ");
//        int rows = kb.nextInt();
//
//        System.out.print("Enter a number of columns : ");
//        int columns = kb.nextInt();

//        for (int i = 1; i <= 5; i++)
//        {
//            for (int j = 1; j <=i; j++)
//            {
//
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }
//
//        System.out.println();
//        System.out.println();
//
//
//        for (int i = 5; i>=1; i--)
//        {
//            for (int j = 1; j <=i; j++)
//            {
//
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }
//
//
//        System.out.println();
//        System.out.println();
//
//        for (int i = 5; i>=1; i--)
//        {
//            for (int j = 1; j <=i; j++)
//            {
//
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }
//
//
//
//        for (int i = 1; i <= 5; i++)
//        {
//
//            for (int j = 5; j >=i; j--)
//            {
//
//                System.out.print(" ");
//            }
//            for (int k = 1; k<=i; k++)
//            {
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }
//
//
//        System.out.println();
//        System.out.println();
//

        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a number of rows : ");
        int rows = kb.nextInt();

        System.out.print("Enter a number of columns : ");
        int columns = kb.nextInt();

        for (int i = rows; i>=1; i--)
        {
            for (int j = 1; j<=i; j++)
            {
                System.out.print(" ");
            }
            for (int k = rows; k >=i; k--)
            {
                System.out.print(i);
            }
            System.out.println();
        }

        int l =rows;
        for (int i = 1; i<=rows; i++)
        {

            for (int j = 1; j <= rows-i; j++)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <=i; k++)
            {
                System.out.print(l);
            }
            l--;
            System.out.println();
        }


//        for (int i = 1; i<=rows; i++)
//        {
//            for (int j = 1; j <= rows-i; j++)
//            {
//
//                System.out.print(" ");
//            }
//            for (int j = 1; j <=i; j++)
//            {
//
//                System.out.print(i);
//            }
//            System.out.println();
//        }



    }
    }

