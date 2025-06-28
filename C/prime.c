#include<stdio.h>
#include<conio.h>
int main()
{
   int n,i=2,flag=0;
   printf("enter any no.=");
   scanf("%d",&n);
   for(i=2;i<=n/2;i++)
   {
     if(n%i==0)
     {
       flag++;
       break;
     }
   }
   if(flag==0)
      printf("given no. is a prime no.%d",i);
   else
      printf("given no. is not a prime no.");
   return 0;
}                                        