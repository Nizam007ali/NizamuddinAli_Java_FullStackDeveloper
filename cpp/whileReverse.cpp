#include <iostream>
using namespace std;

int main()
{
    int n, t, r=0;
    cout<<"Enter any number : ";
    cin>>n;
    t=n;
    while(t>0){
        r=(r*10+(t%10));
        t=t/10;
    }
    cout<<r<<endl;
}
