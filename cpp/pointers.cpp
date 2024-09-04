#include <iostream>
using namespace std;

int main()
{
	int *a;							//pointer declaration
	int b, c;
	cout<<"Enter an integer : ";
	cin>>b;
	cout<<"Enter another integer : ";
	cin>>c;
	
	//two ways to initialise pointer
	a = &b;
	cout<<"b : "<<b<<endl;				// value of b
	cout<<"&b : "<<&b<<endl;			// address of b
	cout<<"&a : "<<&a<<endl;			// address of a
	cout<<"a : "<<a<<endl;				// address of b
	cout<<"*a : "<<*a<<endl;			// pointer to value of b i.e show value of b
	
	*a = c;
	cout<<"c : "<<c<<endl;
	cout<<"&c : "<<&c<<endl;
	cout<<"a : "<<a<<endl;
	cout<<"a : "<<&a<<endl;
	cout<<"*a : "<<*a<<endl;
}
