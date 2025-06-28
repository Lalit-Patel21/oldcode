#include <string.h>
#include <stdio.h>
void initialize(char );
int main()
{
    char ch;
    initialize(ch);
    printf("%c",ch);
    return 0;
}
void initialize(char p)
{
    p='B';
}
