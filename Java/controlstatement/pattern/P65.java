package controlstatement.pattern;

public class P65 {

    public static void main(String[] args)
    {

        for (int i = 0; i<5; i++)
         {
            int num=1;
            for (int j = 0; j<5 - i; j++) {
                System.out.print(" ");
            }
            for (int k=0; k<=i; k++)
            {
                System.out.print(num+" ");
                num=num*(i-k)/(k+1);
            }
            System.out.println();
        }
    }
}




    // public static void main(String[] args) {

    //     for (int i = 0; i < 5; i++) {
    //         int num=1;
    //         for (int j =0; j <=  i; j++) {
            
    //           System.out.print(num+" ");
    //           num=num*(i-j)/(j+1);
    //         }
    //         System.out.println();
    //     }
    // }

