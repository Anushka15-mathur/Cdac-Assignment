//============================================================================
// Name        : Temperatur.cpp
// Author      : anushka
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <stdio.h>
//Function prototype


float celsiusToFahrenheit(float c){
	return (c * 9.0/5.0) + 32.0;
}
float fahrenhentiToCelsius(float f){
	return (f-32.0) * (5.0/9.0);
}

int main() {
	int choice;
	float temp,result;
	printf("Temperature Converter\n");
	printf("1. Celsius to Fahrenheit\n");30
	printf("2. Fahrenheit to Celsius\n");
	printf("Entre your choice(1 or 2 )");
	scanf("%d",&choice);

	switch(choice) {

	case 1:

		printf("Entre temperature in Celsius:\n");
		scanf("%.2f", &temp);
		result = celsiusToFahrenheit(temp);
		printf("%.2f Celsius = %.2f Fahreheint\n", temp,result);
		break;

	case 2:

			printf("Entre temperature in Fahreheint:\n");
			scanf("%.2f",&temp);
			result =fahrenhentiToCelsius(temp);
			printf("%.2f Fahreheint = %.2f Celsius\n", temp,result);
			break;

	default:
		printf("Invalid Choice");
	}

	return 0;
}




