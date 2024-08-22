#include <iostream>
#include <math.h>
using namespace std;
int main()
{
	char k;
	cout<<"Check if key is number, small, capital alphabet or character..."<<endl;
	cout<<"Press any key of keyboard : ";
	cin>>k;
	if(k>47 && k<58)
		cout<<"It's a number.";
	else if(k>64 && k<91)
		cout<<"It's a capital alphabet.";
	else if(k>96 && k<123)
		cout<<"It's a small alphabet.";
	else
		cout<<"It's a character.";
		
}

