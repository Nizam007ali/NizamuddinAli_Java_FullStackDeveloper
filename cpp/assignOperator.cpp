#include <iostream>
using namespace std;
int main()
{
	int a=20, b=4;              //assign
    a+=b;
    cout<<"a+=b : "<<a<<endl;	//add assign 20+4
    a-=b;
    cout<<"a-=b : "<<a<<endl;	//subtract assign 24-4
    a*=b;
    cout<<"a*=b : "<<a<<endl;	//multiply assign 20*4
    a/=b;
    cout<<"a/=b : "<<a<<endl;	//division assign 20/4
    a%=b;
    cout<<"a%=b : "<<a<<endl;	//modulus assign  5%4
    
    a=11, b=7;
    a&=b;
    cout<<"a&=b : "<<a<<endl;	//bitwise and assign 11&7 3
    a|=b;
    cout<<"a|=b : "<<a<<endl;	//bitwise or modulus assign 3|7 7
    a=15;
    a^=b;
    cout<<"a^=b : "<<a<<endl;	//bitwise xor modulus assign 15^7 8
    b=2;
    a>>=b;
    cout<<"a>>=b : "<<a<<endl;	//shift-right assign 8>>2 2
    a<<=b;
    cout<<"a<<=b : "<<a<<endl;	//shift-left assign 8<<2 8
	
    return 0;
}

