package twodarray1assignments;

public class P8 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        for (int []arr1:arr) {
            for (int element : arr1)
                System.out.print(element + " ");
            System.out.println();
        }

        for (int r = 0; r < arr.length; r++) {
            int sum=0;
            for (int c = 0; c < arr[r].length; c++)
            {
                sum=sum+arr[r][c];
            }
            System.out.println("sum of "+(r+1)+" row all element is :"+sum);
        }

        int[][] brr = new int[][]{
                {5, 25, 15},
                {46, 25, 30},
                {35, 60, 45}
        };

        for (int []arr1:brr) {
            for (int element : arr1)
                System.out.print(element + " ");
            System.out.println();
        }
        for (int r = 0; r < brr.length; r++)
        {
            int sum=0;
            for (int c = 0; c < brr[r].length; c++)
            {
             sum=sum+brr[r][c];
            }
            System.out.println("sum of "+(r+1)+" row all element is :"+sum);
        }

    }

}
