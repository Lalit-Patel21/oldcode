import java.util.Scanner;
class Calculator
{
  public static void main(String []args)
  {
   Scanner kb = new Scanner(System.in);
   int a,b;
   
  System.out.println("Enter first no : ");
  a=kb.nextInt();

  System.out.println("Enter Second no : ");
   b=kb.nextInt();

  System.out.println("First number is :  " +a);
  System.out.println("Second number is : " +b);

  System.out.println("sum  is :  " +(a+b));
  System.out.println("SubTraction  is :  " +(a-b));
  System.out.println("Multi is :  " +(a*b));
  System.out.println("Div  is :  " +(a/b));
  System.out.println("Modulo  is :  " +(a%b));

 } 
}
