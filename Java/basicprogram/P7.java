<<<<<<< HEAD
//Q.6 Sort the array of 0s , 1s and 2s.
package arrayassignments1;

public class P7 {
    public static void main(String[] args) {

//      int []arr = new int[]{0,1,0,2,0,1,1,2,2,0,0};
//        int zeroCount=0,oneCount=0,twoCount=0;
//        for (int i=0;i< arr.length;i++)
//        {
//                if (arr[i]==0)
//                {
//                    zeroCount++;
//
//                } else if (arr[i]==1)
//                {
//                    oneCount++;
//                }
//                else
//                {
//                    twoCount++;
//                }
//            }
//
//        for (int j=0;j<arr.length;j++)
//        {
//            if (zeroCount!=0)
//            {
//                arr[j]=0;
//                zeroCount--;
//
//            } else if (oneCount!=0)
//            {
//                arr[j]=1;
//                oneCount--;
//
//            }
//            else
//            {
//                arr[j]=2;
//                twoCount--;
//
//            }
//        }
//        for (int i:arr)
//        {
//            System.out.print(i+" ");
//        }



//        int []arr = new int[]{0,1,0,1,0,1,1,0,1,0,0};
//
//        for (int i=0;i< arr.length;i++)
//        {
//            for (int j=i+1;j<arr.length;j++)
//            {
//                if (arr[i] == 1)
//                {
//                    if(arr[j]==0)
//                    {
//                        arr[i]=0;
//                        arr[j]=1;
//                    }
//                }
//
//            }
//        }
//        for (int i:arr)
//        {
//            System.out.print(i+" ");
//        }



        int []arr = new int[]{0,1,0,2,0,1,1,2,2,0,0};
//        int k = arr.length-1;
        for (int i=0;i< arr.length;i++)
        {
            for (int j=i+1;i<arr.length;i++)
            {
                if (arr[i] == 1)
                {
                    if (arr[j]==0)
                    {
                     arr[i]=0;
                     arr[j]=1;
                    }
//                    else
//                        arr[]
                }
                if(arr[i]==2)
                {
                    if (arr[j]==0){
//                        arr[k--]=2;
                        arr[i]=0;
                    }

                }
                if(arr[i]==2)
                {
                    if (arr[j]==1){
//                        arr[k--]=2;
                        arr[i]=1;
                        arr[j]=2;
                    }

                }

            }
        }
        for (int i:arr)
        {
            System.out.print(i+" ");
        }
    }
=======
//7. A student will not be allowed to sit in exam if his/her attendence is less than 75%.
//Take following input from user
//Number of classes held
//Number of classes attended.
//And print
//percentage of class attended
//Is student is allowed to sit in exam or not.
package basicprogram;
public class P7 {
>>>>>>> 099ca2a (basic program)
}
