#include <iostream>
using namespace std;

int main()
{
	// three ways to create pointer
    int* a;					// preffered
    int *b;
    int * c;
    int x, y, z;
    
    cout<<"Enter value of x : ";
    cin>>x;
    cout<<x;
    cout<<"Enter value of y : ";
    cin>>y;
    
    cout<<"Value of x : "<<x<<endl;
    cout<<"Value of y : "<<y<<endl;
    cout<<"Value of &x : "<<&x<<endl;
    cout<<"Value of &y : "<<&y<<endl;
    
    a = &x;
    b = &y;
    cout<<"Value of *a : "<<*a<<endl;
    cout<<"Value of *b : "<<*b<<endl;
    cout<<"Value of a : "<<a<<endl;
    cout<<"Value of b : "<<b<<endl;
    
    z = (*a + *b);
    c = &z;
    cout<<*c;
}
