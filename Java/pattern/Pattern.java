package pattern;
import java.util.*;
public class Pattern{
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("enter No. of rows :");
        int rows=kb.nextInt();

        System.out.println("enter No. of column :");
        int columns=kb.nextInt();
         
        Pattern1 p=new Pattern1();

        p.first1(rows,columns);

    //     for(int i=1;i<=rows;i++)
    //    {
    //       for(int j=1;j<=column;j++)
    //       {
    //           System.out.print("*");
    //       }
    //       System.out.println();

    //     }
      }
}
