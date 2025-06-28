package ClassPractical;

//import java.util.Scanner;

public class PalindromeString2{

    public static void main(String[] args) {
//        Scanner kb = new Scanner(System.in);
//        System.out.print("enter a String :");
//        String str = kb.nextLine();
         String s = "A man, a plan, a canal: Panama";
         StringBuffer sb = new StringBuffer();

        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
//            if((ch>='A' && ch<='Z')||( ch >='a' && ch <='z')||( ch>='0' && ch <= '9'))
            if(Character.isLetterOrDigit(ch))
            {
                sb.append(ch);
            }
            System.out.println();
//           String str = sb.toString().toLowerCase();
//            System.out.println(str);
        }
     }
}