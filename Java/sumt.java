import java.util.Scanner;

public class sumt {
        public static void main(String []args)
        {
            Scanner kb = new Scanner(System.in);
            String choice;
            do
            {
                System.out.println("enter 2 integer : ");
                int a=kb.nextInt();
                int b=kb.nextInt();
               
                System.out.println("sum is " +(a+b));
                System.out.println("do you want to continue(yes/no)?");
                kb.nextLine();
                choice=kb.nextLine();
               }
               while(choice.equalsIgnoreCase("yes"));
        }
    
}
