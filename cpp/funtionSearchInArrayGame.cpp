#include <iostream>
using namespace std;
	
int cnt = 3;

int search(int x[10], int s){
	for( int i = 0; i < 10; i++){
		if(s == x[i]){
			return 1;
		}
		else{
			if(i == 9){
				cnt--;
				if(cnt==0){
					cout<<"          you lost, Try again"<<endl;
					break;
				}
				cout<<"          you lost, only "<<cnt<<" chances left."<<endl;
			}
		}
	}
}

int main()
{
	cout<<"Welcome to search game enter number between 1 to 100 \nYou only 3 chances to win or loss \n\n";
	int arr[10] = { 2, 58, 95, 65, 24, 39, 62, 81, 72, 42}, n;
	for(int i = 0; i < 3; i++){
		cout<<"     enter value to search : ";
		cin>>n;
		if(search( arr, n) == 1){
			cout<<"          you win.";
			break;
		}
	}
}

