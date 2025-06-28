package ShreyaMedam;

import java.util.Scanner;

public class MaxPlace {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of CSE department getting placements Students :");
        int cse = sc.nextInt();

        System.out.print("Enter the number of ECE department getting placements Students :");
        int ece = sc.nextInt();

        System.out.print("Enter the number of MECH department getting placements Students :");
        int mech = sc.nextInt();

        if ((cse < 0) || (ece < 0) || (mech < 0)) {
            System.out.println("Input is Invalid");
        } else if ((cse == ece) && (cse == mech)) {
            System.out.println("all department has equal number of placements:" + mech + "\nNone of the department has got the highest placement ");
        } else if ((cse > ece) && (cse > mech)) {
            System.out.println("the CSE department getting maximum placements :" + cse);
        } else if ((ece > cse) && (ece > mech)) {
            System.out.println("the ECE department getting maximum placements :" + ece);
        } else if ((mech > cse) && (mech > ece)) {
            System.out.println("the Mech department getting maximum placements :" + mech);
        } else if (cse == ece) {
            System.out.println("CSE & ECE has got highest placement");
        } else if (cse == mech) {
            System.out.println("CSE & MECH has got highest placement");
        } else {
            System.out.println("MECH & ECE has got highest placement");
        }
    }
}


//        else if(cse==ece&&cse>mech)
//        {
//            System.out.println("CSE & ECE has got highest placement");
//        } else if(cse==mech&&mech>ece)
//        {
//            System.out.println("CSE & MECH has got highest placement");
//        }else if(mech==ece&&mech>cse)
//        {
//            System.out.println("MECH & ECE has got highest placement");
//        }
//



