package assignment2;

import java.util.Scanner;

public class As7
{
    public static void main(String[] args)
    {
    Scanner kb = new Scanner(System.in);
    int pos = 0, neg = 0, zero = 0;
    String choice;
    do
    {
        System.out.print("Enter the number : ");
        int num = kb.nextInt();

        if (num > 0)
            pos++;
        else if (num < 0)
            neg++;
        else
            zero++;
        System.out.print("Do you want to continue y/n? : ");
        choice = kb.next();
    }while(choice.equalsIgnoreCase("y"));
        System.out.println("positive numbers :"+pos);
        System.out.println("negative numbers :"+neg);
        System.out.println("zero numbers :"+zero);
  }

}
