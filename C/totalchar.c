#include<stdio.h>
#include<conio.h>
int main()
{
    char l[10],p[6]; int i=0;
    printf("enter two string : ");
    gets(l);
    fflush(stdin);
    gets(p);

    printf("entered string is : %s %s",l, p);
    while (l[i]!='\0')
    {
        printf("\n%c",l[i]);
        i++;
    }
    
    return 0;
}