//============================================================================
// Name        : student.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

class Student{
private:
	string name;
	int  rollNumber;
	float marks;
	char grade;

public:

	 Student(){
		grade = 'N';
	}
	void setname(string n){
		name = n;
	}

	void setrollNumber(int r){
			rollNumber = r;
		}

	void setmarks(float m){
			marks = m;
		}

	void setgrade(char g){
			grade = g;
		}
	string getname() const {
		return name;
	}

	int getrollNumber() const {
			return rollNumber;
		}

	float getmarks() const {
			return marks;
		}

	char getgrade() const {
			return grade;
		}

	void acceptInformation() {
	        string n;
	        int r;
	        float m;

	        cout << "Enter Name: ";
	        cin >> n;

	        cout << "Enter Roll Number: ";
	        cin >> r;

	        cout << "Enter Marks: ";
	        cin >> m;

	        setname(n);
	        setrollNumber(r);
	        setmarks(m);
	    }

	void displayInformation() {
	        cout << "\nStudent Details:" << endl;
	        cout << "Name: " << getname() << endl;
	        cout << "Roll Number: " << getrollNumber() << endl;
	        cout << "Marks: " << getmarks() << endl;
	        cout << "Grade: " << getgrade() << endl;
	    }
	void calculateGrade(){

		if( marks >= 90 && marks <= 100)
		        grade ='A';
		else if( marks >= 80 && marks <= 89)
				grade ='B';
		else if( marks >= 70 && marks <= 79)
				grade ='C';
		else if( marks >= 60 && marks <= 69)
				grade ='D';
		else
			grade = 'F';

		cout<< "Grade Calculation Successfull"<<endl;

	}
};

int main() {

	Student s;
	int choice;

	 do{

		cout<<"\n --------Menu--------"<<endl;
		cout<<"Accept Information"<<endl;
		cout<<"Display Information"<<endl;
		cout<<"Calculate Grade"<<endl;
		cout<<"Exit"<<endl;
		cout<<"Enter your choice"<<endl;
		cin>> choice;

		switch(choice){

		case 1:{
			s.acceptInformation();
			break;
		}

		case 2:
              s.calculateGrade();
			break;
	    case 3:
	          s.displayInformation();
              break;

		case 4:
			cout<<"Exiting Program..."<<endl;
			break;

		default :
			cout<<"Invalid Choice"<<endl;
			break;

	}
	 }
	while(choice != 4);

	return 0;
}
