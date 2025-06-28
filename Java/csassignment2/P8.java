//8. Modify the above question to allow student to sit if he/she has medical cause.
// Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.
package csassignment2;
import java.util.Scanner;
public class P8 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Number of classes held :");
        int ch = kb.nextInt();

        System.out.println("Number of classes attended :");
        int ca = kb.nextInt();

        double per = ca * 100.0 / ch;
        System.out.println(per + " percentage of class attended.");

        if (per>=75) {
            System.out.println("A student will be allowed to sit in exam");
        }
        else{
            System.out.println("he/she has medical cause or not (enter 'Y' or 'N' ) :");
            String medical = kb.next();
            if(medical.equalsIgnoreCase("y"))
              System.out.println("A student will be allowed to sit in exam");
            else
                System.out.println("A student will not be allowed to sit in exam");
        }
    }
}
