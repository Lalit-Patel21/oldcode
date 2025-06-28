//14.Write a program to accept percantage from the user and
//display grade according to the following criteria
//  Marks	  		Grade
//  > 90       		 A
//  >80 and <=90		 B
//  >=60 and <=80		 C
//  below 60		 D
package csassignment2;

import java.util.Scanner;

public class P14 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter percentage : ");
        int per = kb.nextInt();

        if(per>90)
            System.out.print("Grad A");
        else if(per>80)
            System.out.print("Grad B");
        else if(per>=60)
            System.out.print("Grad C");
        else
            System.out.print("Grad D");
    }
}
