#include<stdio.h>

int main()
{
    int n,i,j,m,l;
    printf("enter no.of rows m = ");
    scanf("%d",&m);
   
    printf("enter value of column n =");
    scanf("%d",&n);

    for(i=1;i<=m;i++)
    {
       for(j=1;j<=n;j++)
        {
            printf("%c ",'*');
        }
        printf("\n");
     }     
return 0;
} 