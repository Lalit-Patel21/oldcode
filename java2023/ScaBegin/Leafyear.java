class Leafyear
{
  public static void main(String args[])
  {
    int n=Integer.parseInt(args[0]);
    
   if(n%100==0)
    {
       if(n%400==0) 
    System.out.println("it is a leap year");
      
   else
    System.out.println("it is not a leap year");
    }
   else if(n%4==0)
    System.out.println("it is a leap year");
   else
    System.out.println("it is not a leap year");
 }
}
