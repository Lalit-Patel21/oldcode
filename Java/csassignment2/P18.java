//3. WAP to calculate the percentage of students
package csassignment2;

import java.util.Scanner;

public class P18 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter the Marks of Phy : ");
        int phy = kb.nextInt();

        System.out.print("Enter the Marks of Chem : ");
        int chem = kb.nextInt();

        System.out.print("Enter the Marks of Maths : ");
        int maths = kb.nextInt();

        double per = (phy + chem + maths) * 100 / 300.0;

        System.out.print("percentage of Student is: "+per);
    }

}
