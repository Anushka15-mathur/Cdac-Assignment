//============================================================================
// Name        : Question2.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

void swapByValue(int a, int b){
	int temp = a;
	a = b;
	b = temp;
	cout<< "Inside Swap by Value: "<< a << " " << b <<endl;
}

void swapByAddress(int *a,int *b){
	int temp = *a;
	*a = *b;
	*b = temp;
	cout<< "Inside Swap by Address: "<< *a << " " << *b <<endl;
}

void swapByReference(int &a,int &b){
	int temp = a;
	a = b;
	b = temp;
	cout<< "Inside Swap by Reference: "<< a << " " << b <<endl;
}
int main() {
	int a = 30;
	int b = 40;

	cout<<"Before Swap:" << a << " " << b << endl;

	swapByValue(a,b);
	cout<<"After Swap by Value" << a << " " << b << endl;

	swapByAddress(&a,&b);
	cout<<"After Swap by Address" << a << " " << b << endl;

	swapByReference(a,b);
	cout<<"After Swap by Reference" << a << " " << b << endl;

	return 0;
}

/*
 Question-2
 In Reference Variable is does not create a new memory and it also does not copy it , it just give a new name for same memory location.
 */
