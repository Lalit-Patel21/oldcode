package controlstatement.pattern;

import java.util.Scanner;

public class P25 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);


//        for (int i = 1; i <= rows; i++)
//        {
//            for (int j = 5; j >=i ; j--)
//            {
//                System.out.print(j);
//            }
//            System.out.println();
//        }


        for (int i = 5; i>=1; i--)
        {
            for (int j = 5; j >=i ; j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
