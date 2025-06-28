#include<stdio.h>

int main()
{
    int n,i,j;
    printf("enter value of n = ");
    scanf("%d",&n);
    for(i=n;i>=1;i--)
    {
        for(j=1;j<=i;j++)
        {
            printf("%d",i);
        }
        printf("\n");
    } 
return 0;
}
    /*for(i=n;i>=1;i--)
    {
        for(j=i;j>=1;j--)
        {
            printf("%d",i);
        }
        printf("\n");
    }
    return 0;
}
output 333
       22
       1 */
   /*for(i=n;i>=1;i--)
    {
        for(j=1;j<=i;j++)
        {
            printf("%d",j);
        }
        printf("\n");
    } 
return 0;
} output
123
12
1*/