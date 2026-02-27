//============================================================================
// Name        : Pointer.cpp
// Author      : anushka
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

int main() {
	int x=10,y=20,z=30;

	int *px = &x;
	int *py = &y;
	int *pz = &z;

	cout<<"Before Swap:\n";
	cout<<"x="<<*px<<",y="<<*py<<",pz="<<*pz<<endl;
	cout<<"Address in px "<<px<<endl;
	cout<<"Address in py "<<py<<endl;
	cout<<"Address in pz "<<pz<<endl;

	int a = *px;
	*px = *pz;
	*pz = a;

	cout<<"\n After Swap:\n";
	cout<<"x="<<*px<<",y="<<*py<<",pz="<<*pz<<endl;
	cout<<"Address in px "<<px<<endl;
	cout<<"Address in py "<<py<<endl;
	cout<<"Address in pz "<<pz<<endl;

	return 0;
}
