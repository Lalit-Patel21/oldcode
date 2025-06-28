//7. WAP to find greater among three number
package csassignment2;
import java.util.Scanner;
public class P22 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter the three number : ");
        int a = kb.nextInt();
        int b = kb.nextInt();
        int c = kb.nextInt();

        if ((a>b) && (a>c)) {
            System.out.println(a + " is greater");
        } else if ((b>a) && (b>c)) {
            System.out.println(b + " is greater");
        } else if ((c>a) && (c>b)) {
            System.out.println(c + " is greater");
        } else {
            System.out.println(a +" thrice are equal number");
        }
    }
    }
