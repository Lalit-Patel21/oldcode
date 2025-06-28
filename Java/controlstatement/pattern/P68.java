//    #
//   *#*
//  **#**
// ***#***
//****#****
package controlstatement.pattern;

public class P68 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <=5-i ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=2*i-1 ; k++) {
                if (k==i)
                {
                    System.out.print("#");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
