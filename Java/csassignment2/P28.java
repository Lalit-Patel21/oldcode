//13. Program to perform arithmetic operation using switch case
package csassignment2;

import java.util.Scanner;

public class P28 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);


        System.out.print("Enter a Arithmetic Operation : ");
        char ch = kb.next().charAt(0);
        System.out.print("Enter two Numbers : ");
//        System.out.print("Enter an integer Number : ");
        int n = kb.nextInt();
        int m = kb.nextInt();
        switch(ch)
        {
            case '+':
            System.out.print("Addition of " +n+" and "+m+ " is : "+(m+n));
            break;
            case '-':
                System.out.print("Subtraction of " +n+" and "+m+ " is : "+(m-n));
                break;
            case '*':
                System.out.print("Multiplication of " +n+" and "+m+ " is : "+(m*n));
                break;
            case '/':
                System.out.print("Division of " +n+" and "+m+ " is : "+(m/n));
                break;
            case '%':
                System.out.print("Modulus (Reminder) of " +n+" and "+m+ " is : "+(m%n));
                break;
            default:
                System.out.print("Enter invalid operator");
        }
    }
}
