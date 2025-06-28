//13. Write a Java program that keeps a number from the user
// and generates an integer between 1 and 7 and displays the name of the weekday.
//Test Data
//Input number: 3
//Expected Output :
//Wednesday
package csassignment2;

import java.util.Scanner;

public class P13 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter an integer between 1 and 7  : ");
        int n = kb.nextInt();
//        switch(n) {
//            case 1:
//                System.out.print("Monday");
//                break;
//            case 2:
//                System.out.print("Tuesday");
//                break;
//            case 3:
//                System.out.print("WednesDay");
//                break;
//            case 4:
//                System.out.print("Thursday");
//                break;
//            case 5:
//                System.out.print("Friday");
//                break;
//            case 6:
//                System.out.print("Saturday");
//                break;
//            case 7:
//                System.out.print("Sunday");
//                break;
//            default:
//                System.out.print("Wrong Number");
//                break;

        if (n == 1) {
            System.out.print("Monday");
        } else if (n==2) {
            System.out.print("Tuesday");
        } else if (n==3) {
            System.out.print("Wednesday");
        }else if (n==4) {
            System.out.print("Thursday");
        }else if (n==5) {
            System.out.print("Friday");
        }else if (n==6) {
            System.out.print("Saturday");
        }else if (n==7) {
            System.out.print("Sunday");
        } else{
            System.out.println("Wrong Number");
            }
        }

        }

