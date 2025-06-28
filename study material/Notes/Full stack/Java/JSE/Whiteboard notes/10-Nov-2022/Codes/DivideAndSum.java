import java.util.Scanner;
class DivideAndSum
{
	public static void main(String[] args)
	{
	  Scanner kb=new Scanner(System.in);
	  System.out.println("Enter 2 int:");
	  int a=kb.nextInt();
          int b=kb.nextInt();
	 try
         {
	  	int c=a/b;
          	System.out.println("Div is "+c);
         }
         catch(ArithmeticException ex)
         {
           System.out.println("Please input non-zero denomnator");
         }  
	int d=a+b;
        System.out.println("Sum is "+d);
        }
}