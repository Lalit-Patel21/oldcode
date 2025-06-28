//    *
//   *_*
//  *_*_*
// *_*_*_*
//*_*_*_*_*
// *_*_*_*
// *_*_*
//  *_*
//   *
package controlstatement.pattern;

public class P80 {
    public static void main(String[] args)
    {
        for (int i=1;i<=5;i++)
    {
        for (int j=1;j<=5-i;j++){
            System.out.print(" ");
        }
        for(int k=1;k<=2*i-1;k++)
        {
            if (k%2==0)
             System.out.print("_");
            else
                System.out.print("*");
        }
        System.out.println();
    }
        System.out.print(" ");
        for (int i=4;i>=1;i--)
    {
        for (int j=1;j<=4-i;j++){
            System.out.print(" ");
        }
        for(int k=1;k<=2*i-1;k++){
            if (k%2==0)
                System.out.print("_");
            else
                System.out.print("*");
        }
        System.out.println();
    }
}
}
