//28. Write a C program to input electricity unit charges and calculate total electricity bill
// according to the given condition: For first 50 units Rs. 0.50/unit For next 100 units Rs. 0.75/unit
// For next 100 units Rs. 1.20/unit For unit above 250 Rs. 1.50/unit An additional surcharge of 20%
// is added to the bill.
package csassignment2;

import java.util.Scanner;

public class P43 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("input electricity unit charges :");
        int unit = kb.nextInt();

        if(unit<=50)
        {
            System.out.print("total electricity bill : "+(unit*0.50));
        }
        else if(unit<=150)
        {
            System.out.print("total electricity bill : "+((50*0.50)+((unit-50)*0.75)));
        }else if(unit<=250)
        {
            System.out.print("total electricity bill : "+((50*0.50)+(100*0.75)+((unit-150)*1.20)));
        }else
        {
            System.out.print("total electricity bill : "+((50*0.50)+(100*0.75)+(100*1.20)+((unit-250)*1.50)));
        }
    }
}
