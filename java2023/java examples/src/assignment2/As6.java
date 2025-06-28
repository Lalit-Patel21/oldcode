package assignment2;

import java.util.Scanner;

public class As6
{

    public static void main(String[] args)
    {

        Scanner kb = new Scanner(System.in);
        String choice;
        do {
            System.out.print("Enter the first number : ");
            int num1 = kb.nextInt();

            System.out.print("Enter the second number : ");
            int num2 = kb.nextInt();
            System.out.println("sum of numbers : "+ (num1 + num2));

            System.out.print("Do you want to continue y/n? : ");
            choice = kb.next();
        }while(choice.equalsIgnoreCase("y"));
    }
}