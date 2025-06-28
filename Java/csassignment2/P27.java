//12. Check given character is vowel or not using switch case
package csassignment2;

import java.util.Scanner;

public class P27 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a Character : ");
        char ch = kb.next().charAt(0);
        switch (ch)
        {
            case 'a': case 'e': case 'i': case 'o':case 'u':case 'A':case 'E':case 'I':case 'O':case 'U':
                    System.out.print(ch+ " is a Vowel");
                    break;
            default:
                    System.out.print(ch + " is a Consonant");
            }
        }

    }
