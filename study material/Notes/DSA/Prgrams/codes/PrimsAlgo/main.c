#include <stdio.h>
#include <conio.h>
#define I 10000
void prim(int[8][8],int[][6]);
void main()
{
   int cost[8][8];
   int t[2][6];
  int i,j,sum=0;
  for(i=1;i<=7;i++)
        {
           for(j=1;j<=7;j++)
			{
			printf("Enter the weight of path from v[%d] to v[%d] or 0 if no path exists:",i,j);
            scanf("%d",&cost[i][j]);
           if(cost[i][j]==0)
				cost[i][j]=I;
			}
      }
  prim(cost,t);
  for(i=0;i<6;i++)
       {
          	printf("\nv[%d] to v[%d]",t[0][i],t[1][i]);
			sum=sum+cost[t[0][i]][t[1][i]];
	   }
  printf("\nCost of the spanning tree is %d",sum);
  getch();
}
void prim(int cost[8][8],int t[][6])
{
    int near[8]={I,I,I,I,I,I,I,I};
    int i,j,u,v,min,k;
    min=I;
    for(i=1;i<=7;i++)
         {
              for(j=1;j<=7;j++)
				{
					if(cost[i][j]<min)
                     {
						min=cost[i][j];
                        u=i;
                        v=j;
                     }
               }
         }
t[0][0]=u;
t[1][0]=v;
near[u]=near[v]=0;

   for(i=1;i<=7;i++)
   {
        if(near[i]!=0)
           {
              if(cost[i][v]>cost[i][u])
					near[i]=u;
              else
                    near[i]=v;
           }
   }
for(i=1;i<=5;i++)
{
   min=I;
   for(j=1;j<=7;j++)
        {
              if(near[j]!=0)
	            {
		          if(cost[j][near[j]]<min)
                    {

                      min=cost[j][near[j]];
                      k=j;
                    }
              }
        }
    t[0][i]=k;
    t[1][i]=near[k];
    near[k]=0;
    for(j=1;j<=7;j++)
         {
			if(near[j]!=0)
           	{
				if(cost[j][k]<cost[j][near[j]])
					near[j]=k;

        	}
       }
	}
}



