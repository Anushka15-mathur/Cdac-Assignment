//============================================================================
// Name        : Banking_System.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

class BankAccount{
private://class
	int accountNumber;
	string accountHolder;
	double balance;

public:
	//setter method
	void setAccountNumber(int accNo){
		accountNumber = accNo;
	}
	void setAccountHolder(string name){
		accountHolder = name;
	}
	void setBalance(double bal){
		balance = bal;
	}

	//getter method
	int setAccountNumber(){
		return accountNumber;
	}
	string setAccountHolder(){
	    return accountHolder;
	}
	double setAccountBalance(){
		return balance;
	}
	//deposit method
	void deposit(double amount){

		balance = balance + amount;
		cout<< "Amount deposited successfully!"<<endl;
	}
	//withdraw method
	void withdraw(double amount){

		if(amount <= balance){
	 balance = balance - amount;
	 cout<< "Withdrawal successful"<<endl;
		}
		else{
			cout<<"Insufficient balance"<<endl;
		}
	}
	//display method
	void displayAccountDetails(){

		cout<< " Account Number:"<< accountNumber << endl;
		cout<< "Account Holder Name:" << accountHolder <<endl;
		cout<< "Balance:" << balance << endl;

	}
};

int main() {

	BankAccount account;
	int choice;
	double amount;

	account.setAccountNumber(101);
	account.setAccountHolder("Anushka");
	account.setBalance(50000);

	do{


		cout<<"1. Deposit"<<endl;
		cout<<"2. Withdraw"<<endl;
		cout<<"3.Display"<<endl;
		cout<<"4.Exit"<<endl;
		cout<<"Enter your choice"<<endl;
		cin>>choice;

		switch(choice)
		{
		case 1:
			cout<< "Enter amount to deposit:"<<endl;
			cin>>amount;
			account.deposit(amount);
			break;
		case 2:
			cout<< "Enter amount to withdraw:"<<endl;
			cin>>amount;
			account.withdraw(amount);
			break;
		case 3:
			account.displayAccountDetails();
			break;
		case 4:
			cout<< "Exiting"<< endl;
			break;
		default:
			cout<< "Invalid choice"<<endl;
		}
	}
	while(choice !=4);

	return 0;
}
