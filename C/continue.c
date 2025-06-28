# include<stdio.h>

int main()
{
    int n,sum=0;
    printf("enter nos and press 0 for stop = ");
    do{
        scanf("%d",&n);
        if(n<0)
         continue;
        
        sum=sum+n;
    }while(n!=0);
    printf("sum is %d ",sum);
   
    return 0;
}