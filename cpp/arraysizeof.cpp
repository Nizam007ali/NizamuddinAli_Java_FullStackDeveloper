#include <iostream>
using namespace std;

int main()
{
	
	//array size ommiting but you have declare value also otherwise size error occur
	string student[] = {"asif", "neeraj", "sachin"};
		
	int marks[3];			//array initialisation
	marks[0] = 85;			//array declaration
	marks[1] = 78;
	marks[2] = 83;
	
	//size of array
	cout<<"Size of student array is "<<sizeof(student)/sizeof(string)<<endl;
	cout<<"Size of marks array is "<<sizeof(marks)/sizeof(int)<<endl;
	
	cout<<endl;
	
	//so we must write like this
	for(int i = 0; i < (sizeof(student)/sizeof(string)); i++){
		cout<<student[i]<<" gets "<<marks[i]<<" marks."<<endl;
	}
	
}

