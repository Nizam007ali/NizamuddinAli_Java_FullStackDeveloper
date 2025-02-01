#include <iostream>
#include <math.h>
using namespace std;

bool special(int a[], int s) {
	bool is = false;
	for(int i=0; i<s-1; i++) {
		if(a[i+1]%a[i]==0) {
			is = true;
		} else {
			is = false;
			break;
		}
	}
	return is;
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
	if(special(arr,s)) {
		cout<<"true";
	} else {
		cout<<"false";
	}
}


