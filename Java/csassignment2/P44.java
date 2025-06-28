//29. Write a program to input choice from user. If user enter ‘+’ as choice then calculate
// addition of 2 number. If Choice ‘>’ then check which number is greatest. If choice is ‘==’ then
// check both number is equal or not.
package csassignment2;

import java.util.Scanner;

public class P44 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("input first Number : ");
        int a = kb.nextInt();

        System.out.print("input second Number : ");
        int b = kb.nextInt();

            System.out.print("input choice from user : ");
            String ch = kb.next();

            switch(ch) {
                case "+":
                    System.out.print("addition of 2 number: "+(a+b));
                    break;
                case ">":
                    if (a>b)
                        System.out.print(a+" is greatest ");
                    else
                        System.out.print(b+" is greatest ");
                    break;
                case "==":
                    if (a==b)
                        System.out.print("both number is equal");
                    else
                        System.out.print("both number is not equal");
                    break;

                default :
                    System.out.print("Invalid choice");
                    break;
            }
    }
}
