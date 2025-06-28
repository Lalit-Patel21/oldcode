package assignment2;

public class As9armSeries {

        public static void main(String[] args) {

            int  temp, i;

            System.out.print("Armstrong number between 1 to 555 : ");

            for (i = 1; i <= 555; i++)
            {
                int sum=0;
                temp = i;

                while(temp!= 0) {

                    int rem = temp% 10;
                    sum += rem * rem * rem;
                    temp/= 10;
                }
                if (i== sum)
                    System.out.print(i);

            }
        }
    }


