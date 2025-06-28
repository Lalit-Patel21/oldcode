package ShreyaMedam;

import java.util.Scanner;

public class MagicBoard {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the four Digits for printing alphabet corresponding entered number to letters:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if((a >=65 && a<=90)||(a>= 97 && a <= 122)) {
            System.out.println(a + " - " + (char) (a));
        }
        else {
            System.out.println(a + " is not valid entry.");
        }

        if ((b >= 65 && b <= 90) ||( b >= 97 && b <= 122)){
            System.out.println(b + " - " + (char) (b));}

        else {
            System.out.println(b + " is not valid entry.");
        }

        if ((c >= 65 && c < 90)||( c >= 97 && c <= 122))
            System.out.println(c + " - " + (char) (c));
        else
            System.out.println(c + " is not valid entry.");

        if ((d >= 65 && d <= 90 )|| (d >= 97 && d <= 122)) {
            System.out.println(d + " - " + (char) (d));
        }
        else {
            System.out.println(d + " is not valid entry.");
        }
    }
    }



