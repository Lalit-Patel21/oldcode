#include<stdio.h>
#include<conio.h>
int main()
{
    int age;
    printf("enter your age = ");
    scanf("%d",&age);
    (age>=18)?printf("you are eligible for voting"):printf("you are not eligible for voting ");
    return 0;
}