import java.util.Scanner;
class Addition
{
  public static void main(String args[])
  {

    
   Scanner kb = new Scanner (System.in);
   
   int a,b;
   
  System.out.println("Enter first no : ");
  a=kb.nextInt();

  System.out.println("Enter Second no : ");
   b=kb.nextInt();


  System.out.println("First number is :  " +a);
  System.out.println("Second number is : " +b);
  System.out.println("sum  is :  " +(a+b));

}

   
}

