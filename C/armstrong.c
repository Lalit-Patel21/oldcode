# include<stdio.h>
# include<conio.h>

int main()
{
    int num,arm=0,temp,n;
    printf("enter a number : ");
    scanf("%d",&num);
    temp=num;
    while(num)
   {
     n=num%10;
     arm+=n*n*n;
     num=num/10;
   }
   if(temp==arm)
    printf("%d is a armstromg number",temp);
   else
   printf("%d is not a armstrong number",temp);
    return 0;
}
