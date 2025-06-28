# include<stdio.h>

int main()
{
    int a,b;
    char choice;
    do{
        printf(" enter 2 no : ");
        scanf("%d%d",&a,&b);
        printf(" sum is %d",a+b);
        printf("\n do you want continue(Y/N):");
        fflush(stdin);
        scanf("%c",&choice);
    }while(choice=='y');
    return 0;
}