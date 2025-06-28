package twodarray1assignments;

public class P4 {
    public static void main(String[] args) {
        int [][]arr = new int[][]{
                {10,20,30},
                {40,50,60},
                {70,80,90}
        };

        System.out.print("\nleft diagonal :");
        for (int r = 0;r<arr.length;r++)
        {
            for (int c =0;c<arr[r].length;c++)
            {
                if (r==c)
                    System.out.print(+arr[r][c]+" ");

            }
        }

        int [][]brr = new int[][]{
                {5,10,15},
                {20,25,30},
                {35,40,45}
        };

        System.out.print("\nright diagonal :");
        for (int r = 0;r<brr.length;r++)
        {
            for (int c =0;c<brr[r].length;c++)
            {
                if (r+c==2)
                    System.out.print(+brr[r][c]+" ");

            }
        }
    }
}
