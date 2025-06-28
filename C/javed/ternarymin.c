#include<stdio.h>

int main()
{
    int x,y,z;
    printf("enter values of x,y and z");

    scanf(" %d %d %d",&x,&y,&z);
    
    x>y?x>z?printf("x is greatest"):printf(" z is greatest"):y>z?printf(" y is greatest"):printf(" z is greatest");
return 0;
}