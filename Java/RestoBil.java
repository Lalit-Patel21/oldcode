import java.util.Scanner;
class RestoBil
{
  public static void main(String args[])
  {
   Scanner kb = new Scanner(System.in);
  
  System.out.println("Enter Customer Name: ");
  String Name = kb.nextLine();
 
  System.out.println("Samosa Price : ");
  int samosa_Price=kb.nextInt();

  System.out.println("Samosa Qty : ");
  int samosa_Qty=kb.nextInt();

  System.out.println("Coke Price  : ");
  int coke_Price=kb.nextInt();

  System.out.println("Coke Qty : ");
  int coke_Qty=kb.nextInt();

   System.out.println();
   System.out.println();
   System.out.println("_______________________________________________");
  System.out.println("| Mr. "+Name+                                  "|");
  System.out.println("_______________________________________________");
  System.out.println(" \t\tQuantity\tPrice ");
  System.out.println("_______________________________________________");

  System.out.println("Samosa\t:\t"+samosa_Qty+"\t\t"+samosa_Price );
  System.out.println("Coke\t:\t"+coke_Qty+"\t\t"+coke_Price );
   System.out.println("_______________________________________________");
  System.out.println("Total\t:\t"+(samosa_Qty+coke_Qty)+"\t\t"+(samosa_Qty*samosa_Price+coke_Qty*coke_Price));
   System.out.println("_______________________________________________");
  
  

  
 } 
}
