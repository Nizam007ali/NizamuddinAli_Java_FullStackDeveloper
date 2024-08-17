#include<iostream>
using namespace std;
int x = 100;
int main()
{
	int x = 10;
	cout<<"global variable ::x is "<<::x;
	cout<<"\nlocal varianle x is "<<x;
}