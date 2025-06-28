package assignment2;
import java.util.Scanner;
public class As8
{
    public static void main(String[] args)
    {

        Scanner kb = new Scanner(System.in);
        int max=0,min=0;
        String choice;
        do {
            System.out.print("Enter the  number : ");
            int num = kb.nextInt();

            if(num>max)
                max=num;

            if(num<min)//there is error
                min=num;
            System.out.print("Do you want to continue y/n? : ");
            choice = kb.next();
        }while(choice.equalsIgnoreCase("y"));
        System.out.println("largest number: "+max);
        System.out.println("Smallest number: "+min);
    }
}
