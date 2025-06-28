//20. W.A.P to check whether a charachter is an alphabet or not.
package csassignment2;

import java.util.Scanner;

public class P35 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);

        System.out.print(" Enter a character :");
        char ch = kb.next().charAt(0);


        if(((ch>=65)&&(ch<=90))||((ch>=97)&&(ch<=122)))
        {
            System.out.println(ch+" character is an alphabet ");
        }
        else
        {
            System.out.println(ch+" character is not an alphabet ");
        }
    }

}
