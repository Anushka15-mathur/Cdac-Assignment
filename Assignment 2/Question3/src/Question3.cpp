//============================================================================
// Name        : Question3.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

int main() {

	int x = 20;
	cout<<"Initial value of x: "<< x << endl;

	int *p = &x;
	int &r = x;

	cout<< "Address of x: "<< &x <<endl;
	cout<< "Value stored in pointer p(Address of x): "<< p << endl;
	cout<< "Address of reference r: "<< &r << endl;

	*p = 40;
	cout<<"After modifying using pointer (*p = 40):"<< endl;
	cout<<"Value of x: "<< x << endl;

	r = 60;
	cout<< "After modifying using reference (r = 60): "<< endl;
	cout<<"Value of x: "<< x <<endl;

	return 0;
}

/*
 Question-1
 1)difference in syntax
 pointer- int *p = &x;
 Reference - int &r = x;
 2) difference in dereferencing
 pointer p stores address of x and *p stores value of x. but r stores value of x. in reference dereferencing works like normal variable.

 Question-2
 p = &z; it is allowed
 but int &r = x;
     r = z; it is not allowed
     because in referencing during initialisation it is bound permanently. it becomes another name for same memory. so it does not hold a different address.

 Question-3
    because reference must always refer to valid memory at declaration time.
    it can not exit without binding.     */
