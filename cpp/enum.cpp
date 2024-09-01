#include <iostream>
using namespace std;

// enum day {
//   sunday,        0 //by default
//   monday,        1
//   tuesday,       2
//   wednesday,     3
//   thursday,      4
//   friday,        5
//   saturday       6
// };
enum day {
  monday = 1,    // 1 //change from 0 to 1 then next value by default get 1 + if we not give value
  tuesday,       // 2
  wednesday,     // 3
  thursday,      // 4
  friday,        // 5
  saturday,      // 6
  sunday       	 // 7 
};

int main() {
    // Create an enum variable and assign a value to it
    enum day d = sunday;

//   // Print the enum variable
//   cout << d;

    //print enum variable switch
switch (d) {
    case 1:
        printf("Today is monday");
        break;
    case 2:
        printf("Today is tuesday");
        break;
    case 3:
        printf("Today is wednesday");
        break;
    case 4:
        printf("Today is thursday");
        break;
    case 5:
        printf("Today is friday");
        break;
    case 6:
        printf("Today is saturday");
        break;
    case 7:
        printf("Today is sunday");
        break;
    }

    return 0;
}
