//    1
//   12
//  123
// 1234
//12345
// 1234
//  123
//   12
//    1
package controlstatement.pattern;

public class P78 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }

        for (int i = 1; i<=4; i++)
        {
            for (int j = 1; j<=i;j++)
            {
                System.out.print(" ");
            }
            for (int k = 1;k<=5-i;k++)
            {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}

