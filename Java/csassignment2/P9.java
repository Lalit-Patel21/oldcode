//9. Write a program to check whether a entered character is lowercase ( a to z )
// or uppercase ( A to Z ).
package csassignment2;

import java.util.Scanner;

public class P9 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Enter a character :");
        char ch = kb.next().charAt(0);

        if(ch>=65 && ch<=90)
            System.out.println(ch+" is a Upper Case character");
        else if (ch>=97 && ch<=122)
            System.out.println(ch+" is a Lower Case character");
        else
            System.out.println(ch+" is a other symbols");
        }
    }
