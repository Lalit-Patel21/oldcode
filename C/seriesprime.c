#include<stdio.h>
#include<conio.h>
int main()
{
    int i, count=0, j, start, end;
    printf("Enter starting number: ");
    scanf("%d", &start);
    printf("Enter ending number: ");
    scanf("%d", &end);
    printf("\nPrime numbers between %d to %d are:\n", start, end);
    for(i=start; i<=end; i++)
    {
        for(j=2; j<i; j++)
        {
           if(i%j==0)
           {
               count++;
               break;
           }
        }
        if(count==0 && i!=1)
            printf("%d ", i);
        count = 0;
    }
    getch();
    return 0;
}