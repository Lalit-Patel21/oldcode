# include<stdio.h>

int main()
{
    int n,sum=0;
    printf("enter nos and press 0 for stop = ");
    do{
        scanf("%d",&n);
        
        sum=sum+n;
    }while(n!=0);
    printf("sum is %d ",sum);
   
    return 0;
}
/*  printf("enter nos and press 0 to stop = ");
    for(;;){
    
    scanf("%d",&n);
    if(n==0)
     break;
    sum=sum+n;
    }
    printf("sum is = %d",sum);
*/