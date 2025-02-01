#include <iostream>
#include <math.h>
using namespace std;

int Sum(int a[], int s) {
	int sum = 0,sm=a[0],ss;
	for(int i=1; i<s; i++) {
		if(a[i]<sm) sm=a[i];
	}
	if(sm==a[0]) ss=a[1];
	else ss=a[0];
	for(int i=1; i<s; i++) {
		if(a[i]<ss && a[i]!=sm) ss=a[i];
	}
	return sm+ss;
}

int main()
{
	int s;
	cout<<"Enter size of array : " ;
	cin>>s;
	int arr[s];
	for(int i=0; i<s; i++) {
		cout<<"Enter value "<<(i+1)<<" : ";
		cin>>arr[i];
	}
		cout<<"Sum : "<<Sum(arr,s);
}

