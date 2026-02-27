//============================================================================
// Name        : AbsoluteValue.cpp
// Author      : anushka
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================


#include <iostream>
using namespace std;

int absolute(int n) {
    return (n < 0) ? -n : n;
}


int myClamp(int val, int lo, int hi) {
    return (val < lo) ? lo : (val > hi ? hi : val);
}

int main() {

cout<<"val lo hi abs clamp"<<endl;
    int v = -15, l = -10, h = 10;
    cout << v << "  " << l << "  " << h << "  " << absolute(v) << "  " << myClamp(v, l, h) << endl;

    v = 0; l = -10; h = 10;
    cout << v << "  " << l << "  " << h << "  " << absolute(v) << "  " << myClamp(v, l, h) << endl;

    v = 25; l = -10; h = 10;
    cout << v << "  " << l << "  " << h << "  " << absolute(v) << "  " << myClamp(v, l, h) << endl;

    v = -3; l = 0; h = 5;
    cout << v << "  " << l << "  " << h << "  " << absolute(v) << "  " << myClamp(v, l, h) << endl;




    return 0;
}

