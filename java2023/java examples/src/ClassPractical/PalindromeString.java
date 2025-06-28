package ClassPractical;

import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("enter a String :");
        String str = kb.next();
        int i = 0;
        int j = str.length()-1;
        boolean isPalindrome = true;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
            {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }
        if(isPalindrome == true)
            System.out.println(str + "Palindrome");
        else
            System.out.println(str + " is not Palindrome");
    }
}


//        String rev="";

//        for(int i=len-1;i>=0;i--)
//        {
//           char ch=str.charAt(i);
//           rev=rev+ch;
//        }
//
//        System.out.println(str);
//        System.out.println(rev);
//        if(str.equalsIgnoreCase(rev))
//            System.out.println("Palindrome");
//        else
//            System.out.println("no Palindrome");

//    }
//
//}
