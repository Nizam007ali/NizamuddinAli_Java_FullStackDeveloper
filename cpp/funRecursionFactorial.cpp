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
	int n;
	cout<<"Enter value of n to get its factorial : ";
	cin>>n;
	cout<<"Factorial of "<<n<<" is "<<fact(n);
}

