class Calculators
{
  public static void main(String args[])
  {
    int a=Integer.parseInt(args[0]);

   

   int b = Integer.parseInt(args[2]);

   switch(args[1])

   {
    
    case "+" :

              System.out.println("sum is " + (a+b));
               break;

  case "-" :

              System.out.println("differance is " +(a-b));
              break;

   case "*":
             System.out.println("product is " +(a*b));
             break;


   case "/" : 
             System.out.println("division is " +(float)(a/b));

              break;
   
   case "%" : 
             System.out.println("modulo is " +(a%b));

              break; 

   default : 
              System.out.println("wrong operator");

 
}
}
}
