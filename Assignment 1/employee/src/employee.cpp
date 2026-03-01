//============================================================================
// Name        : employee.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <string>

using namespace std;

class Employee {
private:
    int empID;
    string empName;
    double empSalary;

public:
    Employee() {
        empID = 0;
        empName = "";
        empSalary = 0.0;
    }

    void setEmpID(int id) {
        empID = id;
    }
    void setEmpName(string name) {
        empName = name;
    }
    void setSalary(double salary) {
        empSalary = salary;
    }

    int getEmpID() {
        return empID;
    }
    string getEmpName() {
        return empName;
    }
    double getEmpSalary() {
        return empSalary;
    }

    double calculateGrossSalary() {
        double bonus = 0;
        if (empSalary <= 5000)
            bonus = empSalary * 0.10;
        else if (empSalary <= 10000)
            bonus = empSalary * 0.15;
        else
            bonus = empSalary * 0.20;
        return empSalary + bonus;
    }

    void displayEmployeeDetails() {
        cout << "Employee ID:" << empID << endl;
        cout << "Name:" << empName << endl;
        cout << "Salary:" << empSalary << endl;
        cout << "Gross Salary:" << calculateGrossSalary() << endl;
    }
};

int main() {
    Employee emp;
    int choice;

    do {
        cout << "1. Add Employee" << endl;
        cout << "2. Calculate Gross Salary" << endl;
        cout << "3. Display Details" << endl;
        cout << "4. Update info" << endl;
        cout << "5. Exit" << endl;
        cout << "Enter your choice: ";
        cin >> choice;

        switch (choice) {
        case 1: {
            int id;
            string name;
            double salary;
            cout << "Enter ID:" << endl;
            cin >> id;
            cout << "Enter Name:" << endl;
            cin >> name;
            cout << "Enter Salary:" << endl;
            cin >> salary;
            emp.setEmpID(id);
            emp.setEmpName(name);
            emp.setSalary(salary);
            break;
        }
        case 2:
            cout << "Gross Salary:" << emp.calculateGrossSalary() << endl;
            break;

        case 3:
            emp.displayEmployeeDetails();
            break;

        case 4: {
            string name;
            double salary;
            cout << "Enter new Name:" << endl;
            cin >> name;
            cout << "Enter new Salary:" << endl;
            cin >> salary;
            emp.setEmpName(name);
            emp.setSalary(salary);
            break;
        }
        case 5:
            cout << "Exit" << endl;
            break;

        default:
            cout << "Invalid choice" << endl;
            break;
        }
    } while (choice != 5);

    return 0;
}
