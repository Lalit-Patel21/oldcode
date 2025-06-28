#include <stdio.h>
#include <stdlib.h>
void insert(int arr[],int child,int n){
int par;
while(child>1){
    par=child/2;
    if(arr[par]>n){
        arr[child]=n;
        return;
    }
    arr[child]=arr[par];
    child=par;
}
arr[1]=n;
}
int del(int arr[],int n){
    int temp;
int x=arr[1];
arr[1]=arr[n];
n--;
int i=1,j=2*i;
while(j<=n){
    if(j<n){
    if(arr[j+1]>arr[j])
        j=j+1;
    }
    if(arr[i]<arr[j]){
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i=j;
        j=2*j;
    }
    else
        break;

}
return x;
}
int main()
{
    int arr[8];
    int i,n;
    for(i=1;i<=7;i++){
        printf("Enter no:");
        scanf("%d",&n);
        insert(arr,i,n);
    }
    printf("The heap is:");
    for(i=1;i<=7;i++)
        printf("\n%d",arr[i]);
    for(i=7;i>=1;i--){
        arr[i]=del(arr,i);
    }
    printf("\nSorted array is :");
    for(i=1;i<=7;i++)
        printf("\n%d",arr[i]);
}
