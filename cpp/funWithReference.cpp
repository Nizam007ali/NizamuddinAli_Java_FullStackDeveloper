#include <iostream>
using namespace std;

int cal(int &x, int &y, char &z){
	if(z=='+')
		return x+y;
	else if(z=='-')
		return x-y;
	else if(z=='*')
		return x*y;
	if(z=='/')
		return x/y;
	else
		return 0;
}

int main()
{
	int a, b;
	char c;

	cout<<"Enter 1 number : ";
	cin>>a;
	cout<<"Enter 2 number : ";
	cin>>b;
	cout<<"Enter either(+,-,*,/) number : ";
	cin>>c;
	
	cout<<a<<" "<<c<<" "<<b<<" = "<<cal(a,b,c);
}

