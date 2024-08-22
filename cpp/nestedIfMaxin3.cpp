#include <iostream>

using namespace std;
int main()
{
	int a, b, c;
	cout<<"Maximum in three numbers."<<endl;
	cout<<"First number : ";
	cin>>a;
	cout<<"Second number : ";
	cin>>b;
	cout<<"Third number : ";
	cin>>c;
	if(a>b){
		if(a>c){
			cout<<"max is "<<a<<endl;	
		}
		else{
			cout<<"max is "<<c<<endl;	
		}
	}
	else{
		if(b>c)
			cout<<"max is "<<b<<endl;
		else
			cout<<"max is "<<c<<endl;
	}
}

