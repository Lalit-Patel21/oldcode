//    A
//   A B
//  A B C
// A B C D
//A B C D E
package controlstatement.pattern;

public class P59 {

    public static void main(String[] args)
    {

        for (int i = 1; i <=5; i++)
        {
            char ch = 'A';
            for (int j = 1; j <= 5-i; j++)
            {
                System.out.print(" ");
            }
            for (int k=1; k<=i ; k++)
            {
                System.out.print(ch++ +" ");
            }
            System.out.println();
        }
    }
}
