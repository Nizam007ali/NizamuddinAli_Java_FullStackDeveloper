#include <iostream>
using namespace std;

int main()
{
	
	int a;
	cout<<"check whether number is negtive, zeo or positive..."<<endl;
	cout<<"enter any number : ";
	cin>>a;

	switch(a>=0){
		case 1:{
			switch(a>0){		
				case 1:{
					cout<<"given number is positive";
					break;
				}
				case 0:{
					cout<<"given number is 0";
					break;
				}
			}
			break;
		}
		case 0:{
			cout<<"given number is negative";
			break;
		}
	}
	
}
