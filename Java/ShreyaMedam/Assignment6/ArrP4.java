////9.Initialize and print all elements of a 2D array.

package ShreyaMedam.Assignment6;

public class ArrP4 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{2, 5, 18, 4, 6, 9, 17},{4,8,9,98,8,0,7}};

        for (int i = 0; i < arr.length; i++)
        {
            for (int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
