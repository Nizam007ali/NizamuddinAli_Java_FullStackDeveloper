#include <iostream>
using namespace std;

int main()
{
	string bike[3] = {"passion", "splendor", "freedom"};	//array declaration and initialisation
	int price[3] = {95000,85000,105000};	
	
	//array start from 0 index 			
	cout<<bike[1]<<endl;									//array accessing 2 value	
	bike[1] = "sp125";										//array value changing
	cout<<bike[1]<<endl;									//array value changed

	//array accessing using 4 value
	for(int i = 0; i < 3; i++){
		cout<<bike[i]<<"\t : "<<price[i]<<endl;
	}
}
