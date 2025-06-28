//7. A student will not be allowed to sit in exam if his/her attendence is less than 75%.
//Take following input from user
//Number of classes held
//Number of classes attended.
//And print
//percentage of class attended
//Is student is allowed to sit in exam or not.
package csassignment2;
import java.util.Scanner;
public class P7 {
        public static void main(String []args) {
            Scanner kb = new Scanner(System.in);

            System.out.println("Number of classes held :");
            int ch = kb.nextInt();

            System.out.println("Number of classes attended :");
            int ca = kb.nextInt();

            double per = ca * 100.0 / ch;
            System.out.println(per + " percentage of class attended.");
            if (per>=75)
              System.out.println("A student will be allowed to sit in exam");
            else
              System.out.println("A student will not be allowed to sit in exam");

        }
}
