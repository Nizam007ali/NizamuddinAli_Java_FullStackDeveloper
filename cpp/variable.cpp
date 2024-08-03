#include <iostream>
using namespace std;
int main()
{
	//Variable :- it is container for storing values
	//Syntax -> data_type variable_name = value;
	string myPet = "Cats";
	cout<<"My favourite pets are : "<<myPet<<endl;
	//more than one variable same type different value
	string cat1 = "Marble", cat2 = "Fluffy", cat3 = "Reo";
	cout<<"My first cat name is : "<<cat1<<endl;
	cout<<"My second cat name is : "<<cat2<<endl;
	cout<<"My third cat name is : "<<cat3<<endl;
	//more than one variable same type same value
	int cat1Age, cat2Age, cat3Age;
	cat1Age = cat2Age = cat3Age = 5;
	cout<<"My cats total age are : "<<cat1Age + cat2Age + cat3Age;
}

