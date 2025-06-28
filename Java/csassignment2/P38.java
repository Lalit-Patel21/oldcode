//23. Write a Java program to input day number and print week day.
package csassignment2;

import java.util.Scanner;

public class P38 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Input the day number : ");
        int n = kb.nextInt();

        switch (n)
        {
            case 1:
                System.out.println(n+" Monday ");
                break;
            case 2:
                System.out.println(n+" Tuesday");
                break;
            case 3:
                System.out.println(n+" Wednesday");
                break;
            case 4:
                System.out.println(n+" Thursday");
                break;
            case 5:
                System.out.println(n+" Friday");
                break;
            case 6:
                System.out.println(n+" Saturday");
                break;
            case 7:
                System.out.println(n+" Sunday ");
                break;
            default:
                System.out.println(n+" is a Valid Number ");
                break;
        }

        }
    }

