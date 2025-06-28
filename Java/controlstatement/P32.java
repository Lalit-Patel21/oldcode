//32) A	b	C	d	E	f	G	h	…… n terms
package controlstatement;

public class P32 {
    public static void main(String []args) {
        System.out.println("Alphabets in uppercase in Odd and lower Case in Even Place are given below: ");
        int ch = 65;
        while (ch <= 90) {
            if (ch % 2 == 1) {
                char c = (char)ch;
                System.out.print(c+" ");
            }
            else {
                char c = (char)(ch+32);
                System.out.print(c +" ");
            }
            ch++;
        }
    }
}
// char ch=65;
//            while (ch<=90) {
//                System.out.print(ch +" ");
//                ch++;
//            }
