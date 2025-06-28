#include<stdio.h>
#include<conio.h>
int main()
{
    int *a,*b;
    printf("enter value of a and b =");
    scanf("%d %d",a,b);
    *a=*a+*b;
    *b=*a-*b;
    *a=*a-*b;
    printf("after swapping value of a is  = %d \n and b is = %d",*a,*b);
    return 0;
}