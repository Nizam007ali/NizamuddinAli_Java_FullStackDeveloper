#include <iostream>
using namespace std;
int main()
{
	//0 represent false, 1 represent true
	
	int a=20, b=12;
    cout<<"a==b : "<<(a==b)<<endl;	//isequal
    cout<<"a!=b : "<<(a!=b)<<endl;	//is not equal
    cout<<"a>b : "<<(a>b)<<endl;	//greater than
    cout<<"a<b : "<<(a<b)<<endl;	//less than
    cout<<"a>=b : "<<(a>=b)<<endl;	//greater than equal to
    cout<<"a<=b : "<<(a<=b)<<endl;	//less than equal to
    
    // logical operator work in bool that is true or false
    // a       b       &&      ||      !
    // true    true    true    true    false   
	// true    false   false   true      -
    // false   true    false   true    true
    // false   false   false   false     -

    bool c = true, d = false;
    cout<<"c&&d : "<<(c&&d)<<endl;	//and
    cout<<"c||d : "<<(c||d)<<endl;	//or
    cout<<"!c : "<<(!c)<<endl;	//not

    return 0;
}

