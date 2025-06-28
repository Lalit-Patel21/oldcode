package ClassPractical;

import java.util.Scanner;

public class findMedianSortedArrays {


        public static double findMedSortedArrays(int[] num1, int[] num2) {


            int n = num1.length + num2.length;

            int[] arr = new int[n];

            int k=1;

            for (int i = 0; i < num1.length; i++)
            {

                arr[i] = num1[i];
                k++;

            }
            for (int i = 0; i <num2.length; i++)
            {

                arr[k+i] = num2[i];
            }
            for (int i = 0; i < n; i++)
            {
                for (int j = i + 1; j < n; j++)
                {
                    if (arr[i] > arr[j])
                    {
                        int temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                    }
                }

            }
            for (int i:arr) {

                System.out.println(" "+arr[i]);

            }


            if (n % 2 == 0)
                return (arr[n / 2] + arr[(n / 2) + 1]) / 2.0;
            else
                return arr[n / 2];
        }


            public static void main(String []args){

                Scanner s = new Scanner(System.in);
                System.out.print("Enter size of the first array:");
                int size1 = s.nextInt();

                int[] arr1;
                arr1 = new int[size1];

                System.out.println("Enter the " + arr1.length + " element of the array : ");
                for (int i = 0; i < arr1.length; i++) {
                    arr1[i] = s.nextInt();
                }

                System.out.print("Enter size of the second the array:");
                int size2 = s.nextInt();

                int[] arr2;
                arr2 = new int[size2];

                System.out.println("Enter the " + arr2.length + " element of the array : ");
                for (int i = 0; i < arr2.length; i++) {
                    arr2[i] = s.nextInt();
                }

                double SecLargest = findMedSortedArrays(arr1, arr2);

                System.out.println("Second largest number is :" + SecLargest);

            }
        }




