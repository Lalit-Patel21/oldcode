//    X
//   X X
//  X __X
// X ____X
//X X X X X
package controlstatement.pattern;

public class P60 {
    public static void main(String[] args)
    {

        for (int i = 1; i <=5; i++)
        {
            for (int j = 1; j <= 5-i; j++)
            {
                System.out.print(" ");
            }
            for (int k=1; k<=i ; k++)
            {
                if (k==1||k==i || i ==5){
                    System.out.print("X ");
                }
                else {
                    System.out.print("__");
                }

            }
            System.out.println();
        }
    }

}
