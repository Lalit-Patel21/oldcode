#include<stdio.h>

int main()
{
    int choice,num,m,n,p,q,r,s,t;
    int f=1;
    int temp,rem=0,count=0;
    
    printf("\n\n....welcome to the Maths World....\n");

    do{
    printf("\n\nSelect an operation\n");

    printf("1.Factorial\n2.Even Odd\n3.Reverse of number\n4.Sum of digits\n5.Total no of digits in number\n6.Greatest digit in number\n7.Smallest digit in number\n8.Sum of greatest and smallest digit\n9.Prime\n10.Quite");


    printf("\nEnter your choice : ");
    scanf("%d",&choice);
  
    switch(choice)
    {
        case 1 : 
                 printf("Enter a number :");
                 scanf("%d",&num);
                for(int i=1;i<=num;i++)
                      f=f*i;
                printf("factorial of given no %d is=%d",num,f); 
                break;

        case 2 : 
                printf("Enter a number :");
                 scanf("%d",&m);
                 if(m%2==0)
                   printf("%d is a Even number ",m);
                 else
                  printf("%d is a Odd number ",m);
                  break;

        case 3 :
                printf("Enter a number :");
                scanf("%d",&n);
                temp=n;
                while(n!=0)
                {
                  rem=(rem*10)+n%10;
                  n=n/10;
                }
                printf("Reverse of %d is = %d ",temp,rem );
                
                 break;

        case 4 :
                 printf("Enter a number :");
                scanf("%d",&p);
                temp=p;
                while(p!=0)
                {
                  rem=rem+p%10;
                  p=p/10;
                }
                printf("Sum of Digits of number %d is = %d ",temp,rem);
                break;

        case 5 :
                 printf("Enter a number :");
                scanf("%d",&q);
                temp=q;
                while(q!=0)
                {
                  count++;
                  q=q/10;
                }
                printf("Total  number of Digits in  %d is = %d ",temp,count);
                break;
        
        case 6 : 
                printf("Enter a number :");
                scanf("%d",&r);
                temp=r;
                while(r!=0)
                {
                  r%10;
                  r=r/10;
                }
                printf("Reverse of %d is = %d ",temp,rem );

        case 7 :

        case 8 :

        case 9 :

        case 10 :  printf(".....Thanks for visiting maths world.......");
                   break;

        default : printf("wrong choice.Try again");
    }

    }while(choice!=10);


    return 0;
}