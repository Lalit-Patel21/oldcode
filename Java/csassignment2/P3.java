//3.A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
//Ask user for their salary and year of service and print the net bonus amount.
package csassignment2;

import java.util.Scanner;

public class P3 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter the Salary : ");
        int sal = kb.nextInt();

        System.out.print("Enter the Year of service : ");
        int ser = kb.nextInt();

        if(ser>5)
            System.out.print("the net bonus amount is : "+(sal+(sal*5)/100.0));
        else
            System.out.print("total cost is : "+(sal));
    }
}

