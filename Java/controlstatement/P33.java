//33) WAP to print Alphabets in reversing order.
package controlstatement;

public class P33 {
    public static void main(String []args) {
        System.out.println("Alphabets in reverse order in uppercase are given below: ");
        char ch=90;
        while (ch>=65) {
            System.out.print(ch +" ");
            ch--;
        }
        System.out.println();
        System.out.println("Alphabets in reverse order in Lowercase are given below: ");
        char c=122;
        while (c>=97) {
            System.out.print(c +" ");
            c--;
        }
    }
}
