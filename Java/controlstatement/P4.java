//Programs | Class Room Assignment-5
//4) WAP to print table of a number.
package controlstatement;

import java.util.Scanner;

public class P4 {
    public static void main(String []args)
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = kb.nextInt();

        System.out.print("Up to Where You Want print table of a number. : ");
        int tab = kb.nextInt();

        int i = 1;
        while(i<=tab){
            System.out.println(n+"*"+i+"="+(n*i));
            i++;
        }
    }
}


