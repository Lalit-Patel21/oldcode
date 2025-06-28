<<<<<<< HEAD
//Q.8
//Given an unsorted array arr[] of size N having both negative and positive integers.
// The task is place all negative element at the end of array without changing the order of
// positive element and negative element.
//Example 1:
//Input :
//N = 8
//arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }
//Output :
//1  3  2  11  6  -1  -7  -5
//
//Example 2:
//Input :
//N=8
//arr[] = {-5, 7, -3, -4, 9, 10, -1, 11}
//Output :
//7  9  10  11  -5  -3  -4  -1
package arrayassignments1;

public class P9 {
    public static void main(String[] args)
    {
    int [] arr = new int[]{1, -1, 3, 2, -7, -5, 11, 6};

    for (int i=0;i<arr.length;i++)
    {
        if(arr[i]>0)
        {
            System.out.printf(arr[i]+" ");
        }
    }
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]<0)
            {
                System.out.printf(arr[i]+" ");
            }
        }





//        int temp;
//        for (int i=0;i< arr.length;i++)
//        {
//            for (int j=i+1;j<arr.length;j++)
//            {
//                if (arr[i]<0&&arr[j]>0)
//                {
//                        temp=arr[i];
//                        arr[i]=arr[j];
//                        arr[j]=temp;
//                }
//
//            }
//        }
//        for (int i:arr)
//        {
//            System.out.print(i+" ");
//        }
    }
=======
package basicprogram;

public class P9 {
>>>>>>> 099ca2a (basic program)
}
