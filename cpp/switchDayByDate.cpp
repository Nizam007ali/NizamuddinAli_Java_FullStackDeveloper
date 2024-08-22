#include <iostream>
using namespace std;
int main()
{
	int d,m,y,ty,o=0;
	bool v=true;
	
	cout<<"Enter date : ";
	cin>>d;
	cout<<"Enter month : ";
	cin>>m;
	cout<<"Enter year : ";
	cin>>y;
	
	if(y>0 && y<9999 && m>0 && m<13 && d>0 && d<32){
	}
	else{
		cout<<"invalid data";
		v=false;
	}
	
	if(v==true){
	ty=y-1;
	
	if(ty>0){
		int r= ty%400;
		int r1;
		if(r>300){
			o+=1;
			r1=r%100;
		}
		else if(r>200){
			o+=3;
			r1=r%100;
		}
		else if(r>100){
			o+=5;
			r1=r%100;
		}
		else{
			r1=r;
		}
		int ly;
		ly=r1/4;
		o+=(r1+ly);
		if(m>1){
			o+=3;
		}
		if(m>2){
			if((y%4)==0)
				o+=1;
		}
		if(m>3){
			o+=3;
		}
		if(m>4){
			o+=2;
		}
		if(m>5){
			o+=3;
		}
		if(m>6){
			o+=2;
		}
		if(m>7){
			o+=3;
		}
		if(m>8){
			o+=3;
		}
		if(m>9){
			o+=2;
		}
		if(m>10){
			o+=3;
		}
		if(m>11){
			o+=2;
		}
		o+=d;
		o%=7;
		
		switch(o){
			case 0:
				cout<<"sunday";
				break;
			case 1:
				cout<<"monday";
				break;
			case 2:
				cout<<"tuesday";
				break;
			case 3:
				cout<<"wednesday";
				break;
			case 4:
				cout<<"thursday";
				break;
			case 5:
				cout<<"friday";
				break;
			case 6:
				cout<<"saturday";
				break;
		}
	}
	}
}

