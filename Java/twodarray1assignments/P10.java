package twodarray1assignments;

public class P10 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        for (int[] arr1 : arr) {
            for (int element : arr1)
                System.out.print(element + " ");
            System.out.println();
        }

        for (int r = 0; r < arr.length; r++) {
            int sum = 0;
            for (int c = 0; c < arr[r].length; c++) {
                sum = sum + arr[r][c];
            }
            System.out.println("sum of " + (r + 1) + " row all element is :" + sum);
        }

        int[][] brr = new int[][]{
                {5, 25, 15},
                {46, 25, 30},
                {35, 60, 45}
        };

        for (int[] arr1 : brr) {
            for (int element : arr1)
                System.out.print(element + " ");
            System.out.println();
        }

        int sRow1 = 0,sRow2 = 0,sRow3 = 0;
        for (int r = 0; r < brr.length; r++)
        {
            for (int c = 0; c < brr[r].length; c++)
            {
                if (r==0)
                    sRow1 =sRow1+ brr[r][c];
                else if (r==1)
                    sRow2 =sRow2+ brr[r][c];
                else
                    sRow3 =sRow3+ brr[r][c];
            }
        }
        System.out.println("sum of rows all element is :[" + (sRow1)+" "+sRow2+" "+sRow3+"]");

        if(sRow1>sRow2&&sRow1>sRow3)
            System.out.println("1sr row sum is greater :"+sRow1);
        else if(sRow2>sRow1&&sRow2>sRow3)
            System.out.println("2nd row sum is greater :"+sRow1);
        else if(sRow3>sRow1&&sRow3>sRow2)
            System.out.println("3rd row sum is greater :"+sRow1);
        else
            System.out.println("sum of 1st 2nd and 3rd row is equal"+sRow1);
    }
}
