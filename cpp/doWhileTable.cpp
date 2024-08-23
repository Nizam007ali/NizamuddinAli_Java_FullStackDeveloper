#include <iostream>
using namespace std;

int main()
{
	int n, r=1;
    cout<<"Enter any number to get table : ";
    cin>>n;

	do {
	  	cout<<n<<" * "<<r<<" = "<<n*r<<"\n";
  		r++;
	}
	while (r <= 10);
}

