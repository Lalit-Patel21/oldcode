package ClassPractical;

import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr;
        arr = new int[n][n];
        System.out.print("Enter the Array arr elements: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                arr[i][j] = kb.nextInt();
            }
        }
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

              if(i==j||(i+j)==arr.length-1)
                  sum = sum+ arr[i][j];
//              else if((i+j)=(n-1))
//              {
//                 sum = sum+ arr[i][j];
//              }

            }
        }
        System.out.println(sum);
    }
}