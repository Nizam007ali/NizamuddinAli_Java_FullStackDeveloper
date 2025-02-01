#include <iostream>
#include <math.h>
using namespace std;

int mean(int d) {
	int sum=0,cnt=0;
	while(d>0) {
		int r = d%10;
		sum+=r;
		cnt++;
		d=d/10;
	}
	return sum/cnt;
}

int main()
{
	int d;
	cout<<"Enter any digit : ";
	cin>>d;
	cout<<"Mean of digit "<<d<<" digit's is "<<mean(d);
}

