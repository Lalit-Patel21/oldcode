#include<stdio.h>
#include<conio.h>
int main()
{
    int n;
    printf("enter value of n = ");
    scanf("%d",&n);
    (n>=0)?printf("%d is a positive number",n):printf("%d is a negative number",n);
    return 0;
}