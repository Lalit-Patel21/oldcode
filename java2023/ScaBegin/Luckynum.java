class Luckynum
{
  public static void main(String args[])
  {
    int a=Integer.parseInt(args[0]);
    
   int b=Integer.parseInt(args[1]);
   

   if((a*b)%2==0)
    System.out.println("lucky number");
    else 
    System.out.println("not a lucky number");
 }
}
