#include<stdio.h>

int main()
{
   int n,fact=1,m;
   printf("enter an integer : ");
   scanf("%d",&n);
   m=n;
   while(n>1)
   {
     fact=fact*n;
     n--;
   }
    printf("factorial of given no %d is = %d",m,fact);
     return 0;
}
/*int f=1,n;
    printf("enter any no.=");
    scanf("%d",&n);
    for(int i=1;i<=n;i++)
     f=f*i;
     printf("factorial of given no %d is=%d",n,f); */