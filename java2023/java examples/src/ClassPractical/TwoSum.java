package ClassPractical;

import java.util.Scanner;

public class TwoSum {

        public static int[] twoSumIndex(int[] arr, int target) {

            int [] brr;

            brr = new int[2];

            for(int i=0;i<arr.length;i++)
            {
                for(int j=i+1;j<arr.length;j++)
                {
                    if((arr[i]+arr[j])==target)
                    {
                        brr[0]=i;
                        brr[1]=j;

                    }
                }
            }
            return brr;
        }



    public static void main(String []args){

        Scanner s = new Scanner(System.in);
        System.out.print("Enter size of the array:");
        int size = s.nextInt();
        int[] arr;
        arr = new int[size];
        System.out.println("Enter the " + arr.length + " element of the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        System.out.print("Enter target value :");
        int target=s.nextInt();

        int []sumIndex = twoSumIndex(arr,target);

        System.out.println("indexes of array :" );
        for(int i=0;i<sumIndex.length;i++)
        {
            System.out.print(" "+sumIndex[i]);
        }

    }
}

