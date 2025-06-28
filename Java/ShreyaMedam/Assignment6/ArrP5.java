//10.Take 20 integer inputs from user and print the following:
//number of positive numbers
//number of negative numbers
//number of odd numbers
//number of even numbers
//number of 0s.
package ShreyaMedam.Assignment6;
public class ArrP5 {
    public static void main(String[] args) {
        int[]arr = new int[]{4,-8,9,98,-8,0,7,89,56,4,3,9,78,59,-7,-50,22,99,13,-67};
        int noPos=0,noNeg=0,noOdd=0,noEven=0,noZero=0;
        for (int i = 0; i < arr.length; i++)
        {
           if (arr[i]>0)
               noPos++;
           else if (arr[i]<0)
               noNeg++;
           else
               noZero++;
           if (arr[i]%2==0)
               noEven++;
           else
               noOdd++;
        }
        System.out.println("number of positive numbers "+noPos);
        System.out.println("number of negative numbers "+noNeg);
        System.out.println("number of 0s "+noZero);
        System.out.println("number of odd numbers "+noOdd);
        System.out.println("number of even numbers "+noEven);
    }
}
