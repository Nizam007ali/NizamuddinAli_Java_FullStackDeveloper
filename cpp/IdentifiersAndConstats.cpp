#include <iostream>
using namespace std;
int main()
{
	//Identifiers and Constants
	
	/*Identifiers are unique name given to variable to 
	identify that variable throughout that program*/
	int a = 22;		//no easy to understand
	int age = 20;	//good way
	/* Rules->
		1. contains letter, digit, underscore(_).
		2. begins with _(_5gSpeed) or letter(speed5g) (cannot start with digit 
		like 5gspeed).
		3. case-sensitive i.e. myVar, Myvar, MyVar are different.
		4. can't contain whitespaces or special characters(&,*,$ etc)
		5. can't use reserve keywords such as int, if, false
	*/
	age = 24;
	int _123, price, Bob_salary, Price, ETC;
	
	/*Constants means unchangeable that is read-only. we use "const" keyword to
	make a variable constant*/
	const int FavouriteNumber = 7;
	// FavouriteNumber = 11;	it will give error read=only variable
	// notes: when you declare a constant variable you must assign value 
	
	cout<<"I am currently "<<age<<" years old and my favourite number is "<<FavouriteNumber;
}

