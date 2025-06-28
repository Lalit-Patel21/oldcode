//15. WAP to check given year is a leap year or not
package csassignment2;

import java.util.Scanner;

public class P30 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Enter a Year :");
        int year = kb.nextInt();
        if(((year%100==0)&&(year%400==0))||((year%100!=0)&&(year%4==0)))
            System.out.println(year+" is a Leaf Year");
        else
            System.out.println(year+" is not a Leaf Year");
    }
}
