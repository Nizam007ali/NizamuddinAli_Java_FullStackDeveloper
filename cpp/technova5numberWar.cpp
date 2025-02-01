#include <iostream>
#include <math.h>
using namespace std;

int war(int arr[], int s) {
	int esum = 0, osum = 0;
	for(int i=0; i<s; i++) {
		if(arr[i]%2==0) {
			esum+=arr[i];
		} else {
			osum+=arr[i];
		}
	}
	if(esum>osum) return esum-osum;
	else return osum-esum;
	return 0;
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
		cout<<war(arr,s);
}

