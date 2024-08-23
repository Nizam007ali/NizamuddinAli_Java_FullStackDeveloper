#include <iostream>
#include <math.h>
using namespace std;
int main()
{
	int n, r, t, d;

	cout<<"enter any number 0 to 255 to get its binary : ";
	cin>>n;
	t = n;

	for(int i=7; i>=0; i--){
		if(t >= pow(2,i)){
			d = pow(2,i);
			r = 1;
			t = t % d;
		}
		else{
			r = 0;
		}
		cout<<r;
	}
	
	cout<<endl;
}

