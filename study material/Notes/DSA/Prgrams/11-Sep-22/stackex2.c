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
    int i,x,choice;
    struct Stack S;
    S.tos=-1;
    do
    {
       printf("\nSelect an operation:");
       printf("\n1.Push\n2.Pop\n3.Quit");
       printf("\nEnter your choice:");
       scanf("%d",&choice);
       switch(choice)
       {
        case 1:
                printf("enter no to push:");
                scanf("%d",&x);
                push(&S,x);
                break;
          case 2:
                x=pop(&S);
                if(x!=-1)
                    printf("\nPopped ele=%d",x);
                break;
          case 3:
                printf("Thank you. Have a good day!");
                break;
          default:
                printf("Wrong choice.Try again");
       }
    } while (choice!=3);
    
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
