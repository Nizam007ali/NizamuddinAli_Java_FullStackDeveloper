#include <iostream>
using namespace std;
int main()
{
    string name;
    cout<<"Enter your name : ";
    cin>>name;                          //userInput
    cout<<"Name : "<<name<<endl;

    string greet = "Hello World! ";             //regular string
    char greet1[] = "by Nizam.";            //c-style string
    cout<<greet;
    cout<<greet1;
}
