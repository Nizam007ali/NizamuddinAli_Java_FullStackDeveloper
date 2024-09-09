#include <iostream>
using namespace std;

int x = 10;			// global variable

void fun(){
	x = 5;			// function variable
	cout <<"function variable x : "<<x<<endl;
}

int main()
{
	cout<<"global variable x : "<<x<<endl;
	fun();
	x = 3;			// local variable
	cout <<"local variable x : "<<x<<endl;
}

