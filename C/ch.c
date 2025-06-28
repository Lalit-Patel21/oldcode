#include<stdio.h>
#include<conio.h>
int main()
{
    char ch,p;
    printf("enter two char : ");
    ch=getchar();
    fflush(stdin);
    p=getchar();

    printf("entered charectered is : %c %c",ch, p);
    return 0;

}