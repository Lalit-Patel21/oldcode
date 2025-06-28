import java.util.Scanner;
class CheckPrimemm
{
  public static void main(String args[])
  {

    
   Scanner Kb = new Scanner (System.in);
   
   int n,m,i;
   
  System.out.println("Enter an integer : ");
   n = Kb.nextInt();
   m =(int) Math.sqrt(n);

  for(i = 2 ; i<=m; i++)
    if(n%i==0)
       break;

   if(i==m+1)

       System.out.println(n+ " is a prime number");

   else

      System.out.println(n+ " is not a prime number");
  }
}


    


 

