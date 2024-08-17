#include <iostream>
using namespace std;
int main()
{
    string txt = "My name is \"Nizamuddin Ali\",\nI have done \'BCA\' with 364\\500\t/72.8";
    // \' for ' , \" for " , \\ for \, \n for line change, \t for tab change
	cout<<txt<<endl;
	cout<<txt[42]<<endl; //index value of 41 character of txt or use txt.at()
	txt[42]='M';
	cout<<txt[42]<<endl; // B change to M
	cout<<txt<<endl;
}
