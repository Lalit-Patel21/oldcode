//    1
//   212
//  32123
// 4321234
//543212345
package controlstatement.pattern;

public class P84 {
    public static void main(String []args) {
        int i, j, k, x, n = 2;
        for (i = 1; i <= 5; i++) {
            for (k = 5; k > i; k--) {
                System.out.print(" ");
            }
            for (x = i; x >= 1; x--) {
                System.out.print(x);
                // n++;
            }
            for (j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
