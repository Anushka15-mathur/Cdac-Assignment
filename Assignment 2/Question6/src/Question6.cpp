//============================================================================
// Name        : Question6.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

class Employee{
private:
	const int employeeId;
	string name;
	float salary;

public:
	Employee(int id, string n, float s): employeeId(id),name(n),salary(s){

	}
	void display() const{

		cout<<"ID: "<<employeeId<<endl;
		cout<<"Name: "<<name<<endl;
		cout<<"Salary: "<<salary<<endl;
	}

};
int main() {

	Employee e1(110, "Krishna", 50000.0);
	e1.display();
	return 0;
}
/*
 Question-1
 because constant members cannot be assigned after object creation.

 Question-2
 it gives compile time error. because constructor body runs after initialization phase.

 Question-3
Initializer list: because it directly initializes members and no need for defaukt constructor and reassignment.
Assigment inside constructor: it initilaizes default first and it assign value and in this way it an extra step which is less efficient.
 */
