//12345
// 1__4
//  1_3
//   12
//    1
package controlstatement.pattern;

public class P52 {
    public static void main(String []args) {
        for (int i = 5; i>=1; i--)
        {
            for (int j = 1; j <= 5-i; j++)
            {

                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++)
            {
                if(i==j || i==5||j==1)
                    System.out.print(j);
                else
                    System.out.print("_");
            }
            System.out.println();
        }
    }
}
