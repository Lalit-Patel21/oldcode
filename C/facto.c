# include<stdio.h>

int main()
{
    int fact=1,n,m;
    printf("Enter a integer number : ");
    scanf("%d",&n);
    m=n;
    if(n==0||n==1)
      printf("factorial of %d number is = %d",n,fact);
    else
    {
        while(n!=0)
        {
            fact=fact*n--; 
        }
        printf("factorial of %d number is = %d",m,fact);
     }
    return 0;
}