#include<stdio.h>

int main()
{
    int n,i,j,m,l;
    printf("enter no.of rows n = ");
    scanf("%d",&n);
   
    printf("enter value of start=");
    scanf("%d",&m);

    printf("enter value of end=");
    scanf("%d",&l);

    for(i=1;i<=n;i++)
    {
        if(m<n){
        for(j=m;j<=l;j++)
        {
            printf("%d ",j);
        }
        printf("\n");
       }
       else
       {
        for(j=m;j>=n;j--)
        {
            printf("%d ",j);
        }
        printf("\n");
       }
    }       
return 0;
} 