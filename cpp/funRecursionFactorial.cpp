#include <iostream>
using namespace std;

int fact(int n){
	if(n==0 or n==1)
		return 1;
	n = n * fact(n-1);
	return n;
}

int main()
{
	cout<<fact(7);
}

