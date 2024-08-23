#include <iostream>
using namespace std;

int main()
{
	cout<<"break at 5"<<endl;			//at 5 loop stops
    for(int i=0; i<10; i++){
        cout<<i<<endl;
        if(i==5)
            break;
    }
    int i=0;
    
    cout<<endl<<"continue at 5"<<endl;	//at 5 loop stops only once then start from 6
    while(i<10){
        i++;
        if(i==5)
            continue;
        cout<<i<<endl;
    }
}
