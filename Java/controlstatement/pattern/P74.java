//123456789
// 1     7
//  1   5
//   1 3
//    1
package controlstatement.pattern;

public class P74 {
    public static void main(String[] args) {

            for (int i = 5; i >= 1; i--) {
                for (int j = 5; j > i; j--) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= 2 * i - 1; k++)
                {
                if (k==1||i==5||k==2*i-1){
                    System.out.print(k);
                }
                else {
                    System.out.print(" ");
                }
                }
                System.out.println();
            }
    }
}
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= 2 * i - 1; k++) {
//                if (k==1||i==5||k==2*i-1){
//                    System.out.print(k);
//                }
//                else {
//                    System.out.print(" ");
//                }
//
//
//            }
//            System.out.println();
//        }