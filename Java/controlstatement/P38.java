//38) WAP to check whether entered number is Armstrong or not
package controlstatement;

import java.util.Scanner;

public class P38 {
//    public static void main(String []args) {
//        Scanner kb = new Scanner(System.in);
//
//        System.out.print("Enter a number : ");
//        int n = kb.nextInt();
//
//        int m=n,p=n;
//
//        int count = 0,temp;
//        while (m!= 0) {
//
//            m = m/10;
//            count++;
//        }
//        System.out.println("total digits in number "+count);
//        double arm = 0;
//        while (p != 0) {
//
//           temp=p % 10;
//           arm=arm+(Math.pow(temp,count));
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

    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = kb.nextInt();

        int m=n,p=n,count = 0,temp,multi,arm=0;

        while (m!= 0) {

            m = m/10;
            count++;
        }
        System.out.println("total digits in number "+count);
        while (p != 0)
        {
           temp=p % 10;
           multi=1;
           int i=1;
           while(i<=count)
           {
               multi=multi*temp;
               i++;
           }
           arm=arm+multi;
           p = p / 10;
        }
        System.out.println("check armstrong  "+arm);

        if(arm==n)
        {
            System.out.println(n+" is a Armstrong number");
        }
        else {
            System.out.println(n+" is not a Armstrong number");
        }
    }
}
