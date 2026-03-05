//============================================================================
// Name        : Question1.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

class Box{

private:
	int length;
	int width;
	int height;
public:
	Box(int length, int width, int height){
		this->length = length;
		this->width = width;
		this->height = height;
	}
 void setdimensions(int length, int width, int height){
			this->length = length;
			this->width = width;
			this->height = height;
		}
 int volumne(){
	 return length*width*height;
 }

};

int main() {
	Box box1(7,5,9);
	cout<<"Volume of box 1: "<<box1.volumne()<<endl;

	Box box2(1,1,1);
	box2.setdimensions(8,4,8);
	cout<< "Volume of box 2: "<<box2.volumne()<<endl;
	return 0;
}
/*
 Question-1.1
 When we create a object memory is is allocated to it, and before using it if we do not initialise it contains garbage value.
 Question-1.2
 when object is created, for constant data members, and for reference variable  */
