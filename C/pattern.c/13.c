#include<stdio.h>

int main()
{
    int n=8,i,j;
    //printf("enter no.of rows n = ");
   // scanf("%d",&n);
   
    for(i=1;i<=n;i++)
    {
       for(j=1;j<=i;j++)
        {
            
            if(i>4&&j<5)
              printf("  ");
            else
               printf("* ");
               
        }
        printf("\n");
        
     }     
return 0;
} 
