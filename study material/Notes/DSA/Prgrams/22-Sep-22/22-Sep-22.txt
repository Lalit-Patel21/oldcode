#include <math.h>
#include <stdio.h>
#include <string.h>
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
    char prefix[20];
    float ans;
    printf("Enter a valid prefix exp:\n");
    scanf("%s",prefix);
    ans=evaluate(prefix);
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
float evaluate(char prefix[])
{
    struct Stack S;
    int i;
    float op1,op2,res;
    char ch;
    S.tos=-1;

    for(i=strlen(prefix)-1;i>=0;i--)
    {
        ch=prefix[i];
        if(isoperand(ch)==1)
        {
            push(&S,ch-48);
        }
        else
        {
            op1=pop(&S);
            op2=pop(&S);
            res=calculate(op1,op2,ch);
            push(&S,res);
        }
    }
    res=pop(&S);
    return res;
}

