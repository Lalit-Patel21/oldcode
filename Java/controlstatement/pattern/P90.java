//*     *
// *   *
//  * *
//   *
//  * *
// *   *
//*     *
package controlstatement.pattern;

public class P90 {
    public static void main(String[] args) {

        for (int i=1;i<=7;i++){
            for (int j=1;j<=7;j++){
                if (j==i||j==8-i)
                    System.out.print("*");
//                else if(i+j==8)
//                    System.out.print("*");
                else
                    System.out.print(" ");

            }
            System.out.println();
        }
    }
}

// if (i!=4||j==8-i)

