#include <iostream>
#include <math.h>
using namespace std;
int main()
{
	int a, b, c, d, max;
	
	cout<<"Enter first number : ";
	cin>>a;
	cout<<"Enter second number : ";
	cin>>b;
	cout<<"Enter third number : ";
	cin>>c;
	cout<<"Enter fourth number : ";
	cin>>d;
	
	max = (a>b && a>c && a>d)?a:((b>c && b>d)?b:(c>d)?c:d);
	cout<<"Maximum number is "<<max;
}

