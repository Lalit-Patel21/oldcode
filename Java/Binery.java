import java.util.Scanner;

public class Binery {
        public static void main(String []args)
        {
            Scanner kb = new Scanner(System.in);
        
            System.out.print("enter a Decimal number : ");
               int n=kb.nextInt();
              int choice;
              do
              {
              System.out.print("select an operation : ");
              System.out.println("\n1.Binary\n2.Octal\n3.Hexadecimal\n4.Quit");
              choice = kb.nextInt();
              switch(choice)
              {

                case 1: int i=0;
                     int [] b=new int[10];;
                        while(n>0)
                       {

                        b[i]=n%2;
                        n/=2;
                        i++;
                       }
                       System.out.print("Binary of "+n+" is : " );
                       for(int j=i-1;j>=1;j--)
                        System.out.print(b[i]);
                    System.out.println();
                         break;
                case 2 : int o;
                     System.out.print("octal of "+n+" is :" );
                    while(n!=1)
                   {

                    o=n%8;
                    System.out.print(o);
                    n/=8;
                   } 
                   System.out.println();
                  break;    
                case 3 : int H;
                System.out.print("Hexadecimal of "+n+" is :" );
                    while(n!=1)
                   {

                    H=n%16;
                    if(H>9)
                    {
                        if(H==10)
                         System.out.print("A");
                        else if(H==11)
                        System.out.print("B");
                        else if(H==12)
                        System.out.print("C");
                        else if(H==13)
                        System.out.print("D");
                        else if(H==14)
                        System.out.print("E");
                        else if(H==15)
                        System.out.print("F");
                    }
                    else
                    {
                     System.out.print(H);
                    }
                     n/=16;
                }
                System.out.println();
                     break;  
                case 4 :
                     System.out.println("thank you\nfor using this app\n"); 
                     break;  
                default : System.out.println("Wrong Choice try again\n");   

              }

            }while(choice!=4);
        }
}

