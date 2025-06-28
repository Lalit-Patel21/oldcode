#include<stdio.h>
int main()
{

    char ch;
    printf("enter any character=");
    scanf("%c",&ch);
    if(ch>=65 &&ch<=90)
      printf("%c is a alphabate of upper case character",ch);
    else if(ch>=97 && ch<=122)
      printf("%c is a alphabate of lower case character",ch);
    else if( ch>=48 && ch<=57)
      printf("%c is a number",ch);
    else
      printf("%c is special sybol or other character ",ch);
    return 0;

}