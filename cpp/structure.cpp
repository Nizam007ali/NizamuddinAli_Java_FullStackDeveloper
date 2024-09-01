#include <iostream>

using namespace std;

int main()
{
	struct {                    // Structure declaration
        int id;                 // Member (int variable)
        string name;            // Member (string variable)
    } student;                  // Structure variable

    // Assign values to members of student
    student.id = 1;
    student.name = "Nizam ali";

    // Print members of student
    cout <<"Id : "<<student.id<<endl;
    cout <<"Name : "<<student.name<<endl;

    //Multiple Variables in one Structure
    struct {
  		int id;
  		string name;
  		string course;
	} stu1, stu2;
	
    stu1.id = 1;
    stu1.name = "Nizam ali";
    stu1.course = "MCA";
    stu2.id = 2;
    stu2.name = "Nitish pandey";
    stu2.course = "MBA";
    
    
    cout <<"Id : "<<stu1.id<<endl;
    cout <<"Name : "<<stu1.name<<endl;
    cout <<"Course : "<<stu1.course<<endl;
    cout <<"Id : "<<stu2.id<<endl;
    cout <<"Name : "<<stu2.name<<endl;
    cout <<"Course : "<<stu2.course<<endl;
    
    return 0;
}

