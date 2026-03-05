//============================================================================
// Name        : Question4.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

int main() {

	int *arr;
	arr = new int[5];
	cout<< "Enter 5 intergers:"<<endl;

	for(int i = 0; i<5; i++){
		cin>> arr[i];
	}
	for(int i = 0; i<5; i++){
		cout<<arr[i]<<" ";
	}
	cout<<endl;

	delete[] arr;

	return 0;
}

/*
 Question-1
 because malloc is aC function and it only alloct raw memory and does not know c++ objects , so no constructor is called.
 Question-2
 beacuse memory allocated with new can be freed using delete, which automatically calls a destructor.
 */
