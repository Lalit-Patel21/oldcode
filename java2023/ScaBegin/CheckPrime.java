import java.util.Scanner;
class CheckPrime
{
  public static void main(String args[])
  {

    
   Scanner Kb = new Scanner (System.in);
   
   int n,i;
   
  System.out.println("Enter an integer : ");
   n = Kb.nextInt();

  for(i = 2; i<= n-1; i++)
    if(n%i==0)
       break;
   if(i==n)

       System.out.println(n+ " is a prime number");

   else

      System.out.println(n+ " is not a prime number");
  }
}


    

