#include <iostream>
using namespace std;

struct teacher {
  	int id;
  	string name;
 	int sal;
};

int main()
{
	// Create a teacher structure and store it in t1;
  	teacher t1;
  	t1.id = 101;
  	t1.name = "Anshuman";
  	t1.sal = 25000;
  	
	// Create a teacher structure and store it in t1;
  	teacher t2;
  	t2.id = 102;
  	t2.name = "Ayushman";
  	t2.sal = 28000;
  	
  	//print value of structure
  	cout<<"Teacher id : "<<t1.id<<", name : "<<t1.name<<", salary : "<<t1.sal<<endl;
  	cout<<"Teacher id : "<<t2.id<<", name : "<<t2.name<<", salary : "<<t2.sal<<endl;
}
