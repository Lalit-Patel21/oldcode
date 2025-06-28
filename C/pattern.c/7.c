#include<stdio.h>

int main()
{
    int n,i,j,k;
    printf("enter value of n = ");
    scanf("%d",&n);

    for(i=1;i<=n;i++)
    {
        for(j=1;j<=n-1-i;j++)
        {
            printf("  ");
        }
            for(k=1;k<=2*i-1;k++)
            {
                 printf("%c",'*');
            }
        
    
        printf("\n");
    }
return 0;
} 