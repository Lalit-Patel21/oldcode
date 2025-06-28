#include<stdio.h>
#include<conio.h>
int main()
{
    int n;
    printf("enter value of n = ");
    scanf("%d",&n);
    (n%2==0)?printf("%d is a even number",n):printf("%d is a odd number",n);
    return 0;
}