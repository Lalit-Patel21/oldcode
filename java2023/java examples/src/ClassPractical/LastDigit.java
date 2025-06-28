package ClassPractical;

import java.util.Scanner;

public class LastDigit {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        System.out.println("enter a number : ");
        int n = kb.nextInt();
        int last = n % 10;
        System.out.println(last);
    }
}
