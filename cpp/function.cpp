#include <iostream>
using namespace std;

void fun1(){				// no argument no return
	int a, b;
	cout<<"Enter value of a : ";
	cin>>a;
	cout<<"Enter value of b : ";
	cin>>b;
	cout<<"Value of a + b : "<<(a+b)<<endl;
}

int fun2(){					// no argument with return
	int a = 58, b = 98;
	return(a+b);
}

void fun3(int a, int b){	// with argument no return
	cout<<"Value of a + b : "<<(a+b)<<endl;
}

int fun4(int a, int b){		// with argument with return
	return(a+b);
}

int main()
{
	fun1();
	cout<<"Value of a + b : "<<fun2()<<endl;
	fun3(24,52);
	cout<<"Value of a + b : "<<fun4(54,96)<<endl;
}

