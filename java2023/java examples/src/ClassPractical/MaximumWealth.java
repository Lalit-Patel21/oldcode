package ClassPractical;

import java.util.Scanner;

public class MaximumWealth {
        public static void main(String[] args) {

            Scanner kb = new Scanner(System.in);
            int n = kb.nextInt();
            int m = kb.nextInt();

            int [][] arr;
            arr = new int[n][m];
            System.out.print("Enter the Array arr elements: ");
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {

                    arr[i][j] = kb.nextInt();
                }
            }
            int  wealth=0,richest=0;
            for (int i = 0; i < arr.length; i++)
            {
                wealth=0;
                for (int j = 0; j < arr[i].length; j++) {

                    wealth += arr[i][j];
                }
                if (wealth > richest) {
                    richest = wealth;
                }
            }
//                richest=Math.max(richest,wealth);
               System.out.println(richest);
        }
}
