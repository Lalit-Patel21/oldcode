#include<stdio.h>
#include<conio.h>
int main()
{
    int a,b,temp;
    printf("enter value of a and b =");
    scanf("%d %d",&a,&b);
    temp=a;
    a=b;
    b=temp;
    printf("after swapping value of c is  = %d and b is = %d",a,b);
    return 0;
}