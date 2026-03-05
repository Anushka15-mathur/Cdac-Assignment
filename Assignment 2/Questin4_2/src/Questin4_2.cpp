//============================================================================
// Name        : Questin4_2.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include<cstdlib>//library for using malloc in cpp
using namespace std;

int main() {

	int *arr = (int*)malloc(sizeof(int));
	cout<<"Enter 5 intergers: "<< endl;

	for(int i = 0; i<5;i++){
		cin>>arr[i];
	}
	for(int i = 0; i<5; i++){
		cout<< arr[i] <<" ";
	}
	cout<<endl;
	free(arr);

	return 0;
}
