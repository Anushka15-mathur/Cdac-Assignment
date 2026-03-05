//============================================================================
// Name        : Question5.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

class Student{
private:
	int rollNo;
	string name;
	float marks;

public:
	Student(){
		rollNo = 0;
		name = "Not Assigned";
		marks = 0.0;
	}

	Student(int rollNo, string name, float marks){
		this->rollNo = rollNo;
		this->name = name;
		this->marks = marks;
	}
	void printDetails() const{
		cout<<"\n Roll No: "<< rollNo<<endl;
		cout<< "\n Name: "<< name<<endl;
		cout<< "\n Marks: "<<marks<<endl;
	}

};

int main() {

	Student s1;

	Student s2(101, "Krishna" ,89.0);
	Student s3(102, "Radha" ,92.5);

	cout<<" Student 1:";
	s1.printDetails();

	cout<< "Student 2:";
	s2.printDetails();

	cout<<"Student 3:";
	s3.printDetails();
	return 0;
}

/*
 Question-1
 Default Constructor is used when their is no constructor in the class, so compiler uses default constructor.

 Question-2
 When you write a constructor in a class then it will not generate any constructor.

 Question-3
 yes constructor can be overloaded*/
