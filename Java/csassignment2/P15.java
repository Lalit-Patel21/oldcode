//15. Write a java program to accept the cost price of a bike
//    and display the road tax to be paid according to the
//    following criteria.
//    Cost Price(In Rs)		Tax
//     > 100000			 15%
//     >50000 and <=100000	 10%
//     <=50000			 5%
package csassignment2;

import java.util.Scanner;

public class P15 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("the cost price of a bike :");
        int cp = kb.nextInt();

        if (cp > 100000)
            System.out.print("the road tax to be paid "+(cp*15/100));
        else if (cp > 50000)
            System.out.print("the road tax to be paid "+(cp*10/100));
        else
            System.out.print("the road tax to be paid "+(cp*5/100));
    }
}
