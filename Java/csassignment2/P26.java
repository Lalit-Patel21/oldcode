//11. Find even odd using switch case
package csassignment2;

import java.util.Scanner;

public class P26 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter an integer Number : ");
        int n = kb.nextInt();
        switch (n % 2) {
            case 0:
                    System.out.print(n + " is a Even Number");
                    break;
                    case 1:
                    System.out.print(n + " is a Odd Number");
//                    break;

            }
    }
}
