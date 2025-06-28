//55555
// 4444
//  333
//   22
//    1

package controlstatement.pattern;

public class P51 {

    public static void main(String []args) {
        for (int i = 5; i>=1; i--)
        {
            for (int j = 1; j <= 5-i; j++)
            {

                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++)
            {

                System.out.print(i);
            }
            System.out.println();
        }
    }
}
