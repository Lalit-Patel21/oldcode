#include<stdio.h>

int main()
{
    int width=8,height=4,i,j;
    //printf("enter no.of rows n = ");
    //scanf("%d",&n);
   
    for(i=1;i<=height;i++)
    {
       for(j=1;j<=width;j++)
        {
            if( i==1||j==1||i==height||j==width)
              printf("* ");
        
            else 
              printf("  ");
        }
        printf("\n");
        
     }     
return 0;
} 
