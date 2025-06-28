//52) WAP to find out all the Armstrong numbers between two entered numbers
package controlstatement;

import java.util.Scanner;

public class P52 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        System.out.print("Enter two Number : ");
        int a = kb.nextInt();
        int b = kb.nextInt();
        if (a <= b) {
            System.out.println("all the Armstrong numbers between two entered numbers " + a + " and " + b + " are given below.");
            for (int i = a; i <= b; i++)
            {
                int rev=0,temp=i;
                for (rev=0; temp!=0; temp=temp/10)
                {
                    rev=rev*10+temp%10;
                }
                System.out.print(" reverse of the "+i+ " is "+rev);
                System.out.println();
            }
        } else {
            System.out.println("all the Armstrong numbers between two entered numbers " + b + " and " + a + "are given below.");
            for (int i = b; i <= a; i++)
            {
                int rev=0,temp=i;
                for (rev=0; temp!=0; temp=temp/10)
                {
                    rev=rev*10+temp%10;
                }
                System.out.print(" reverse of the "+i+ " is "+rev);
                System.out.println();
            }
        }
    }
}
// Scanner kb = new Scanner(System.in);
//
//        System.out.print("Enter a number : ");
//        int n = kb.nextInt();
//
//        int m=n,p=n,count = 0,temp,multi,arm=0;
//
//        while (m!= 0) {
//
//            m = m/10;
//            count++;
//        }
//        System.out.println("total digits in number "+count);
//        while (p != 0)
//        {
//           temp=p % 10;
//           multi=1;
//           int i=1;
//           while(i<=count)
//           {
//               multi=multi*temp;
//               i++;
//           }
//           arm=arm+multi;
//           p = p / 10;
//        }
//        System.out.println("check armstrong  "+arm);
//
//        if(arm==n)
//        {
//            System.out.println(n+" is a Armstrong number");
//        }
//        else {
//            System.out.println(n+" is not a Armstrong number");
//        }
//    }