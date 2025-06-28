#include <math.h>
#include <stdio.h>
struct Stack
{
    float arr[20];
    int tos;
};
void push(struct Stack *,float);
float pop(struct Stack*);
int isoperand(char);
float calculate(float,float,char);
float evaluate(char[]);
int main()
{
    char postfix[20];
    float ans;
    printf("Enter a valid postfix exp:\n");
    scanf("%s",postfix);
    ans=evaluate(postfix);
    printf("Result is %f",ans);
    return 0;
}
void push(struct Stack *p,float x)
{
    if(p->tos==19)
    {
        printf("Stack Overflow");
        return;
    }
    p->tos++;
    p->arr[p->tos]=x;
}
float pop(struct Stack *p)
{
    float x;
    if(p->tos==-1)
    {
        printf("Stack underflow");
        return -1.0;
    }
    x=p->arr[p->tos];
    p->tos--;
    return x;
}
int isoperand(char ch)
{
    return (ch>=48 && ch<=57);
}
float calculate(float op1,float op2,char ch)
{
    switch(ch)
    {
    case '+':
                return op1+op2;
    case '-':
                return op1-op2;
    case '*':
                return op1*op2;
    case '/':
                return op1/op2;
    case '%':
                return fmod(op1,op2);
    case '$':
                return pow(op1,op2);
    default:
                return 0.0;

    }
}
float evaluate(char postfix[])
{
    struct Stack S;
    int i;
    float op1,op2,res;
    char ch;
    S.tos=-1;
    for(i=0;postfix[i]!='\0';i++)
    {
        ch=postfix[i];
        if(isoperand(ch)==1)
        {
            push(&S,ch-48);
        }
        else
        {
            op2=pop(&S);
            op1=pop(&S);
            res=calculate(op1,op2,ch);
            push(&S,res);
        }
    }
    res=pop(&S);
    return res;
}

