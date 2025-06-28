#include<stdio.h>
#include<conio.h>
int main()
{
    int n,x;
    printf(" enter a four digit number = ");
    scanf("%d",&n);
    x=n%10;
    n=n/100;
    x=x+n%10;
    printf("sum of second and last digit is = %d ",x);
    return 0;     
}