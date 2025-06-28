//ABCDE
// ABCD
//  ABC
//   AB
//    A
package controlstatement.pattern;

public class P55 {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            char ch='A';
            for (int j = 1; j <= 5 - i; j++) {

                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(ch++);
            }
            System.out.println();
        }
    }
}

