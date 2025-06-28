#include<stdio.h>
#include<conio.h>
int main()
{
    int n;
    char c;
    //printf("enter any no.=");
   // scanf("%d",&n);
    // c=n;
    for(n=1;n<=128;n++)
    {
     c=n;  
     printf("%d = %c\n",n,c);

    }
   
     return 0;
}