class Calculator
{
  public static void main(String args[])
  {
    int a=Integer.parseInt(args[0]);

    char ch=args[1].charAt(1);

   int b = Integer.parseInt(args[2]);

   if(ch=='+')
    System.out.println("sum is" +(a+b));

   else if(ch=='-')
    System.out.println("differance is" +(a-b));

   else if(ch=='*')
    System.out.println("product is" +(a*b));

   else if(ch=='/')
    System.out.println("division is" +(float)(a/b));
 }
}
