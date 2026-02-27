//============================================================================
// Name        : Reference_Parameter.cpp
// Author      : anushka
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

void findMinMax(int a, int b, int c, int &minVal, int &maxVal){

    minVal = a;
    maxVal = a;

    if(b < minVal)
        minVal = b;

    if(c < minVal)
        minVal = c;

    if(b > maxVal)
        maxVal = b;

    if(c > maxVal)
        maxVal = c;
}


int main() {

    int a, b, c;
    int low, high;

    cout << "Enter three integers: ";
    cin >> a >> b >> c;


    findMinMax(a, b, c, low, high);


    cout << "Minimum value: " << low << endl;
    cout << "Maximum value: " << high << endl;

    return 0;
}


