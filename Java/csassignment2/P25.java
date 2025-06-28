//10. Print number between 1 to 5 in word format
package csassignment2;

import java.util.Scanner;

public class P25 {
    public static void main(String []args) {

        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a number between 1 to 5 : ");
        int n = kb.nextInt();
//        if (n == 1) {
//            System.out.println(n + " is One");
//        } else if (n==2) {
//            System.out.println(n + " is Two");
//        } else if (n==3) {
//            System.out.println(n + " is Three");
//        }else if (n==4) {
//            System.out.println(n + " is Four");
//        }else if (n==5) {
//            System.out.println(n + " is Five");
//        }
//        else{
//            System.out.println("Wrong Number");
//            }

            switch(n) {
                case 1:
                    System.out.print("One");
                    break;
                case 2:
                    System.out.print("Two");
                    break;
                case 3:
                    System.out.print("Three");
                    break;
                case 4:
                    System.out.print("Four");
                    break;
                case 5:
                    System.out.print("Five");
                    break;
                default:
                    System.out.print("Wrong Number");
//                    break;

            }

        }
    }
