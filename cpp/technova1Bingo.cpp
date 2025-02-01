#include <iostream>
#include <math.h>
#include <String.h>
using namespace std;

bool bingo(string a[]) {
	bool is=false;
	string str = a[0]; 
	int s = 4;
	for(int i=1; i<s; i++) {
		if(str == a[i]) {
			is = true;
		} else {
			is = false;
			break;
		}
	}
	return is;
};

int main()

{
	string arr[4];
	int size = sizeof(arr)/sizeof(arr[0]);
	for(int i=0; i<size; i++) {
		cout<<"Enter "<<i+1<<" character : ";
		cin>>arr[i];
	}
	if(bingo(arr)) {
		cout<<"true";
	} else {
		cout<<"false";
	}
}

