//6. Write a program to print absolute value of a number entered by user. E.g.-
//INPUT: 1        OUTPUT: 1
//INPUT: -1        OUTPUT: 1
package csassignment2;
import java.util.Scanner;
public class P6 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Enter a value: ");
        int n = kb.nextInt();

        int abs = (n>=0)?n:-n;
        System.out.println("absolute value of a number "+n+" is: "+abs);

    }
}

