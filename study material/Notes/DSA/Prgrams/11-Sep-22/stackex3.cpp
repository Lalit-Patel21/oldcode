#include <iostream>
using namespace std;
class Stack
{
    int arr[5];
    int tos;
public:
    Stack()
    {
        tos=-1;
    }
    void push(int x)
    {
         if(tos==4)
        {
            cout<<endl<<"Stack Overflow";
            return;
        }
       tos=tos+1;
       arr[tos]=x;
       cout<<endl<<"Pushed "<<x<<" successfully!";
    }
    int pop()
    {
        int x;
        if(tos==-1)
        {   
            cout<<endl<<"Stack Underflow";
            return -1;
        }
        x=arr[tos];
        tos=tos-1;
        return x;
    }
       
};
int main()
{
    int x,choice;
    Stack S;
    do
    {
       cout<<"\nSelect an operation:";
       cout<<"\n1.Push\n2.Pop\n3.Quit";
       cout<<"\nEnter your choice:";
       cin>>choice;
       switch(choice)
       {
        case 1:
                cout<<"enter no to push:";
                cin>>x;
                S.push(x);
                break;
          case 2:
                x=S.pop();
                if(x!=-1)
                    cout<<"\nPopped ele="<<x;
                break;
          case 3:
                cout<<"Thank you. Have a good day!";
                break;
          default:
                cout<<"Wrong choice.Try again";
       }
    } while (choice!=3);
    
    return 0;

}
