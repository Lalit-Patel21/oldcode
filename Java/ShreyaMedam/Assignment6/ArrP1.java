//6 wap to find and print prime numbers in given array

package ShreyaMedam.Assignment6;

public class ArrP1 {
    public static void main(String[] args) {

        int[] arr = new int[]{2, 5, 8, 4, 6, 9, 17};

        for (int i = 0; i < arr.length; i++)
        {
            int j;
            for (j = 2; j <= arr[i] / 2; j++)
            {
                if (arr[i] % j == 0)
                    break;
            }
            if(j>arr[i]/2)
              System.out.println(" "+arr[i]);

        }
    }
}
