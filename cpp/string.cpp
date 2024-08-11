#include <iostream>
#include <string>   //string library

using namespace std;

int main()
{
	//string used for storing characters and text
    string fname="Nizam ", lname="Ali";              //"" used around string

    string fullname= fname+" "+lname;               //string concatenate 
    cout<<fullname<<endl;
    fname.append(lname);                            //fname concatenate
    cout<<fname<<endl;                              //nizam ali

    string a="10", b="20";
    cout<<a+b<<endl;                                //1020 becuse in string they concatenate

    string c="10";
    int d=20;
    //cout<<c+d<<endl;                              //return error

    cout << "The length of the full name is : " << fullname.length()<<endl;      //retun length 
    cout << "The length of the last name is : " << lname.size()<<endl;        //this also return length both are same

    return 0;
}

