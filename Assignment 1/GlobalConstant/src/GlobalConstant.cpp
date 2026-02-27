//============================================================================
// Name        : GlobalConstant.cpp
// Author      : anushka
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

const float PI = 3.14158f;

float circleArea(float radius);
float circlePerimeter(float radius);

float circleArea(float radius) {
    return PI * radius * radius;
}

float circlePerimeter(float radius) {
    return 2 * PI * radius;
}

int main() {

	float radius = 7.0f;

	float area = circleArea(radius);
	float perimeter = circlePerimeter(radius);
	cout.precision(4);
	cout << fixed;
	cout << "Area: " << area << endl;
	cout << "Perimeter: " << perimeter << endl;

	//PI = 3.0f; error: assignment of read-only variaabel 'PI'

	return 0;
}
