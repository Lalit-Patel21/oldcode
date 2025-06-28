# include<stdio.h>

int main()
{
    int a,b;
    char choice='y';
    while(choice=='y')
      {
          printf("Enter two number : ");
          scanf("%d %d",&a,&b);
          printf("sum is = %d",a+b);
          printf("\ndo you want continue(Y/N)");
          scanf(" %c",&choice);
      }    
    printf("Thankyou for visiting my site ");
    return 0;
}