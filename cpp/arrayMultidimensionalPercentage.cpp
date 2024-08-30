#include <iostream>
using namespace std;

int main()
{
	string s[3];
	int m[3][5], t[3] = {0, 0, 0};
	
	for(int i = 0; i < 3; i++){
		cout<<"Enter "<<(i+1)<<" student name : ";
		cin>>s[i];
	}
	
	for(int i = 0; i < 3; i++){
		for(int j = 0; j < 5; j++){
			cout<<"Enter "<<s[i]<<" "<<(j+1)<<" subject marks : ";
			cin>>m[i][j];
		}
	}
	cout<<endl;
	for(int i = 0; i < 3; i++){
		cout<<"Name : "<<s[i]<<endl;
		for(int j = 0; j < 5; j++){
			cout<<"Subject "<<(j+1)<<" marks "<<m[i][j]<<endl;
			t[i] += m[i][j];
		}
		cout<<"total marks : "<<t[i]<<endl;
		cout<<"Percentage : "<<t[i]/5<<endl<<endl;
	}
}

