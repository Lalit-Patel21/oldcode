#include <stdio.h>
struct Stack
{
    int arr[5];
    int tos;
};
void push(struct Stack *,int);
int pop(struct Stack *);
int main()
{
    int i,x;
    struct Stack S;
    S.tos=-1;
    for(i=1;i<=6;i++)
    {
        printf("\nEnter no:");
        scanf("%d",&x);
        push(&S,x);
    }
    for(i=1;i<=6;i++)
    {
        x=pop(&S);
        if(x!=-1)
            printf("\nPopped ele=%d",x);
    }
    return 0;

}
void push(struct Stack *P,int x)
{
    if(P->tos==4)
    {
        printf("\nStack Overflow");
        return;
    }
    P->tos=P->tos+1;
    P->arr[P->tos]=x;
    printf("\nPushed %d successfully!",x);
}
int pop(struct Stack *P)
{
    int x;
    if(P->tos==-1)
    {
        printf("\nStack Underflow");
        return -1;
    }
    x=P->arr[P->tos];
    P->tos=P->tos-1;
    return x;
}
