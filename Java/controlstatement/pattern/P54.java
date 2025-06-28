//ABCDE
// A__B
//  A_B
//   AB
//    A
package controlstatement.pattern;

public class P54 {
    public static void main(String[] args) {


        for (int i = 5; i >= 1; i--) {
            char ch='A';
            for (int j = 1; j <= 5 - i; j++) {

                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (i == j || i == 5 || j == 1)
                    System.out.print(ch++);
                else
                    System.out.print("_");
            }
            System.out.println();
        }
    }
}
