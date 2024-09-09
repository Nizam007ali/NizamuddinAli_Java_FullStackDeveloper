#include <iostream>
using namespace std;
int sum = 0; 
void add(int x){
	cout<<"sum is "<<x<<endl;
}

void add(int x, int y){
	sum = x + y;
	cout<<"sum of "<<x<<" + "<<y<<" = "<<sum<<endl;
}

void add(double x, double y){
	double(sum) = x + y;
	cout<<"sum of "<<x<<" + "<<y<<" = "<<sum<<endl;
}

void add(double x, int y){
	double(sum) = x + double(y);
	cout<<"sum of "<<x<<" + "<<y<<" = "<<sum<<endl;
}

void add(int x, double y){
	double(sum) = x + y;
	cout<<"sum of "<<x<<" + "<<y<<" = "<<sum<<endl;
}

int main()
{
	add(9);
	add(58, 12);
	add(0.9,26.8);
	add(9.8,75);
	add(84,6.2);
}

