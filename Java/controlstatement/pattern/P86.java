//**********
//****  ****
//***    ***
//**      **
//*        *
package controlstatement.pattern;

public class P86 {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--)
        {
            for (int j = 10; j >=1; j--)
            {
                if((j>i) && (j<=(10-i)))
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }

    }
}
