#include<stdio.h>
#include<conio.h>
int main()
{
    int n,x;
    printf(" enter a four digit number = ");
    scanf("%d",&n);
    x=n%10;
    n=n/10;
    x=x+n%10;
    n=n/10;
    x=x+n%10;
    n=n/10;
    x=x+n%10;
    printf("sum of all digit of number is = %d ",x);
    return 0;     
}