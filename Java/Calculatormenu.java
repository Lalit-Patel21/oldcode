import java.util.Scanner;

public class Calculatormenu {
        public static void main(String []args)
        {
            Scanner kb = new Scanner(System.in);
        
            System.out.println("enter 2 integer : ");
               int a=kb.nextInt();
               int  b=kb.nextInt();
               int choice;
              do
              {
              System.out.println("select an operation : ");
              System.out.println("1.Add\n2.Sub\n3.Multi\n4.Div\n5.Mod\n6.Quit");
              choice = kb.nextInt();
              switch(choice)
              {

                case 1:  System.out.println("sum is " +(a+b));
                         break;
                case 2 : System.out.println("difference  is " +(a-b)); 
                          break;    
                case 3 : System.out.println("product  is " +(a*b)); 
                          break;  
                case 4 : System.out.println("Divison  is " +(float)a/b); 
                          break; 
                case 5 : System.out.println("Modulo is " +(a%b)); 
                          break; 
                case 6 : System.out.println("thank you\nfor using this app\n"); 
                          break;  
                default : System.out.println("Wrong Choice try again\n");   

              }

            }while(choice!=6);
        }
}

