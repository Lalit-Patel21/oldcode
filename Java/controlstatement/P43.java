//43) WAP to convert binary number into decimal number
package controlstatement;

import java.util.Scanner;

public class P43 {
    public static void main(String []args){

        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a binary number : ");
        int n = kb.nextInt();

//        System.out.println(" binary number of "+n+" are :");
//        while(n!=0)
//        {
//            System.out.print(n%2);
//            n=n/2;
//
//        }

        System.out.print("decimal of binary number of "+n+" is :");
        while(n!=0)
        {
            System.out.print(n%2);
            n=n/2;

        }

    }
}
