//    1
//   101
//  10101
// 1010101
//101010101
package controlstatement.pattern;

public class P89 {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++)
        {
            for (int j=1;j<=5-i;j++)
            {
                System.out.print(" ");
            }
            for (int k=1;k<=2*i-1;k++){
                if(k%2==0)
                    System.out.print("0");
                else
                    System.out.print("1");
            }
            System.out.println();
        }
    }
}

