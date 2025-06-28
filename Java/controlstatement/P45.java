//45) WAP to find out the sum of all the digits of a number
package controlstatement;

import java.util.Scanner;

public class P45 {
    public static void main(String []args){

        Scanner kb = new Scanner(System.in);

//
//        System.out.println();
//        System.out.print("Enter number of rows : ");
//        int r = kb.nextInt();
//
//        System.out.print("Enter number of rows : ");
//        int k = kb.nextInt();
//
//        for(int i=0;i<r;i++)
//        {
//            for(int j=0;j<k;j++)
//             System.out.print("*");
//            System.out.println();
//        }

        System.out.print("Enter a number : ");
        int n = kb.nextInt();

        System.out.print("sum of digit in number is "+n+ " : ");

        int count = 0,sum=0;
        while (n != 0) {

            sum=sum+n%10;
            n = n / 10;

        }
        System.out.print(sum);

    }
}
