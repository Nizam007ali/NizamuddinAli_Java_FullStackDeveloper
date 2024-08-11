#include <iostream>
using namespace std;
int main()
{
	int a, b;
    cout<<"Enter value of first integer : ";
    cin>>a;
    cout<<"Enter value of second integer : ";
    cin>>b;

    cout<<"a+b : "<<a+b<<endl;	//add
    cout<<"a-b : "<<a-b<<endl;	//subtract
    cout<<"a*b : "<<a*b<<endl;	//multiply
    cout<<"a/b : "<<a/b<<endl;	//division
    cout<<"a%b : "<<a%b<<endl;	//modulus i.e. remainder
    a++; 						//increment, use like this i.e. a become increase by 1
    cout<<"a++ : "<<a<<endl;	//this show increased value
    cout<<"b-- : "<<b--<<endl;	//decrement, its value decrease but it show before value
	cout<<"b-- : "<<b<<endl;	//this show increased value
	
    return 0;
}

