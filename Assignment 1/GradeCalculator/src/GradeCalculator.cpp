//============================================================================
// Name        : GradeCalculator.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <stdio.h>


int main() {
	float sub1;
	float sub2;
	float sub3;
	float sub4;
	float sub5;

	printf("Enter the marks of sub1:\n");
	fflush(stdout);
	scanf("%f",&sub1);
	printf("Enter the marks of sub2:\n");
	fflush(stdout);
		scanf("%f",&sub2);
		printf("Enter the marks of sub3:\n");
		fflush(stdout);
			scanf("%f",&sub3);
			printf("Enter the marks of sub4:\n");
			fflush(stdout);
				scanf("%f",&sub4);
				printf("Enter the marks of sub5:\n");
				fflush(stdout);
					scanf("%f",&sub5);

	float total = sub1 + sub2 + sub3 + sub4 + sub5;
	float percentage = total/5;

	const char *grade = (percentage >= 75) ? "A":
			      (percentage >= 60) ? "B":
			      (percentage >= 45) ? "C": "Fail";

	printf("\n Marks of Subject 1 :%.2f\n",sub1);
	fflush(stdout);
	printf(" Marks of Subject 2 :%.2f\n",sub2);
	fflush(stdout);
	printf(" Marks of Subject 3 :%.2f\n",sub3);
	fflush(stdout);
	printf(" Marks of Subject 4 :%.2f\n",sub4);
	fflush(stdout);
	printf(" Marks of Subject 5 :%.2f\n",sub5);
	fflush(stdout);
	printf("Total : %.2f\n",total);
	fflush(stdout);
	printf("Percentage: %.2f%%\n",percentage);
	fflush(stdout);
	printf("Grade: %s\n",grade);
	fflush(stdout);

	return 0;





}
