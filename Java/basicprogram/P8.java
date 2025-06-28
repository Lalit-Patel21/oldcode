<<<<<<< HEAD
//Q.7 Sub array with given sum
//Given an unsorted array A of size N that contains only non-negative integers, find a continuous sub-array which adds to a given number S.
//
//Example 1:
//Input:
//N = 5, S = 12
//A[] = {1,2,3,7,5}
//Output: 2 4
//Explanation: The sum of elements
//from 2nd position to 4th position
//is 12.
//
//Example 2:
//Input:
//N = 10, S = 15
//A[] = {1,2,3,4,5,6,7,8,9,10}
//Output: 1 5
//Explanation: The sum of elements
//from 1st position to 5th position
//is 15.
//1 <= N <= 105
//1 <= Ai <= 109
package arrayassignments1;

public class P8 {
    public static void main(String[] args) {

        int [] arr = new int[]{1,2,3,4,5};
        int n = 12,sum=0,j=0,i=0;
        boolean flag=false;
        first:
        for (i=0;i<arr.length;i++)
        {
            sum=arr[i];
            for (j=i+1;j<arr.length;j++)
            {
                sum=sum+arr[j];
                if(n==sum)
                {
//                    System.out.println((i+1)+" "+(j+1));
                    flag=true;
                    break first;
                }

            }
        }
        if (flag)
            System.out.println("sub array whose sum is :"+n+ " and sub array from "+(i+1)+" to "+(j+1));
        else
          System.out.println("no found a sub array whose sum is :"+n);
    }
=======
package basicprogram;

public class P8 {
>>>>>>> 099ca2a (basic program)
}
