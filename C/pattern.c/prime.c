#include<stdio.h>

int main()
{
    int n,i,m=0;

    printf("enter a integer : ");
    scanf("%d",&n);
    for(i=2;i<=n/2;i++)
    {
        if(n%i==0){
            m=1;
            break;
        }
    }
    if(m==0)
      printf(" given no. %d is a prime no. ",n);
    else
       printf("given no. %d is not a prime no. ",n);
return 0;
}