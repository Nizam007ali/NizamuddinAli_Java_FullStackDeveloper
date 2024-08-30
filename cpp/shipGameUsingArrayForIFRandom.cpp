#include <iostream>
#include <cstdlib>
#include <time.h> 
using namespace std;

int main()
{
	bool ship[5][5] = {{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0}};
	int ran[5] = {-1,-1,-1,-1,-1,},k=0,shipcnt=5;
	srand(time(0)); 

//	for(int i = 0; i < 5; i++){
//		for(int j = 0; j < 5;j++){
//			if(j!=4)
//			cout<<ship[i][j]<<" : ";
//			else
//			cout<<ship[i][j];
//		}
//		cout<<endl;
//	}
//	cout<<endl<<endl;
	
	for(int i = 0; i < 5; i++){
		int r = rand()%25;
		ran[i] = r;
		for(int j = 0; j < i; j++){
			if(ran[i]==ran[j]){
				int r = rand()%25;
				j--;
			}
			else{
				ran[i]=r;
			}
		}
	}
	
	for(int l = 0; l < 5; l++){
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 5; j++){
				if(ran[l]==k){
					ship[i][j] = 1;
				}
				k++;
			}
		}
		k=0;
	}

//	for(int i = 0; i < 5; i++){
//		for(int j = 0; j < 5;j++){
//			cout<<ship[i][j]<<" : ";
//		}
//		cout<<endl;
//	}
//	cout<<endl<<endl;
	
	cout<<"Welcome to ship game "<<endl<<endl;
	cout<<"you have only 10 turns to destroy 5 ships"<<endl;
	cout<<"there sre 5 rows and 5 column choose wisely to win"<<endl<<endl;
	
	for(int i=0; i<10; i++){
		int ro,co;
		cout<<"_______________________________________________________________"<<endl<<endl;
		cout<<(i+1)<<" turn : "<<endl;
		cout<<"enter row : ";
		cin>>ro;
		cout<<"enter column : ";
		cin>>co;
		if((ro>5 || ro<1) || (co>5 || co<1)){
			cout<<"reenter values from 0 to 5 : "<<endl;
			cout<<"enter row : ";
			cin>>ro;
			cout<<"enter column : ";
			cin>>co;
		}
		if(ship[(ro-1)][(co-1)] == 1){
			cout<<"1 ship destroyed"<<endl;
			shipcnt--;
			cout<<shipcnt<<" ship left..."<<endl;
			if(shipcnt==0){
				cout<<"Congratulations, you win...";
				break;
			}
		}
		else{
			cout<<"you missed the shot"<<endl;
		}
		if(shipcnt>0 and i==9){
			cout<<shipcnt<<" ship left....."<<endl;
			cout<<"Better luck next time....."<<endl;
		}
	}
}


