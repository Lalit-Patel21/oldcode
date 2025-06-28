package ClassPractical;

import java.util.Scanner;

public class PalindromeNum {


        public static void main(String[] args) {
            Scanner kb = new Scanner(System.in);
            System.out.print("enter a number :");
            int n = kb.nextInt();
            int temp = n;
            int rev=0;
            for(;n!=0;n/=10)
            {
                int rem = n%10;
                rev=rev*10+rem;
            }
//            while(n!=0)
//            {
//                int rem = n%10;
//                rev=rev*10+rem;
//                n/=10;
//            }
            if( rev==temp)
                System.out.println(temp+ " is a palindrome");
            else
                System.out.println(temp+ " is not a palindrome");
        }

    }

