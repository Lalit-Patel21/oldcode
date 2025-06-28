//2.A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
//Ask user for quantity
//Suppose, one unit will cost 100.
//Judge and print total cost for user.
package csassignment2;

import java.util.Scanner;

public class P2 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter the number of quan : ");
        int quan = kb.nextInt();

        int total_cost=quan*100;
        if(total_cost>1000)
            System.out.print("total cost is : "+(total_cost-(total_cost*10/100.0)));
        else
            System.out.print("total cost is : "+(total_cost));
    }
}
