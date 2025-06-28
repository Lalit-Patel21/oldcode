package twodarray1assignments;

public class P6 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        System.out.println("\nTranspose of above Matrix arr is :");
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                    System.out.print(+arr[c][r] + " ");
            }
            System.out.println();
        }
        int[][] brr = new int[][]{
                {5, 10, 15},
                {20, 25, 30},
                {35, 40, 45}
        };
        System.out.println("\nTranspose of above Matrix arr is :");
        for (int r = 0; r < brr.length; r++) {
            for (int c = 0; c < brr[r].length; c++) {
                    System.out.print(+brr[c][r]+ " ");
            }
            System.out.println();
        }
    }
}
