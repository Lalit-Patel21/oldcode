import java.util.Scanner;
class CheckPrimem
{
  public static void main(String args[])
  {

    
   Scanner Kb = new Scanner (System.in);
   
   int n,i;
   
  System.out.println("Enter an integer : ");
   n = Kb.nextInt();

  for(i = 2 ; i<= n/2; i++)
    if(n%i==0)
       break;

   if(i==(n/2+1))

       System.out.println(n+ " is a prime number");

   else

      System.out.println(n+ " is not a prime number");
  }
}


    

