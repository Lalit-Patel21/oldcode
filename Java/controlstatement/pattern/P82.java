//    *
//   *_*
//  *___*
// *_____*
//*********
// *_____*
// *___*
//  *_*
//   *
package controlstatement.pattern;

public class P82 {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++)
        {
            for (int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                if (k==1||i==5||k==2*i-1){
                    System.out.print("*");
                }
                else {
                    System.out.print("_");
                }
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
                if (k==1||i==5||k==2*i-1){
                    System.out.print("*");
                }
                else {
                    System.out.print("_");
                }
            }
            System.out.println();
        }

    }
}
