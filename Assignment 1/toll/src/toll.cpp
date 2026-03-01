//============================================================================
// Name        : toll.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

class TollBooth{
private:
	int totalVehicle;
	double totalRevenue;

public:
	//constructor
	TollBooth(){
		totalVehicle = 0;
		totalRevenue = 0;
	}

	//reset method
	void reset(){
		totalVehicle = 0;
		totalRevenue = 0;
		cout<< "Booth statistics reset successfully"<<endl;
	}
	//add vehcile
	void vehiclePayingToll(int vehicleType,double tollAmount){
		totalVehicle++;
		totalRevenue += tollAmount;
		cout<< "Toll collected:"<< tollAmount <<endl;
	}
		//getter method
		int getTotalVehicle(){
			return totalVehicle;
		}
		double getTotalRevenue(){
			return totalRevenue;
		}
};

int main() {
	TollBooth booth;
	int choice;
	//fixed toll amount

	const double CAR_TOLL = 108;
	const double TRUCK_TOLL = 300;
	const double BUS_TOLL = 350;

	do{

		cout<< "========Toll Booth Menu======"<<endl;
		cout<<"1. Add Standard Car and collect toll"<<endl;
		cout<< "2. Add Truck and collect toll"<<endl;
		cout<< "3. Add Bus and collect toll"<<endl;
		cout<< "4. Display total vehicles passed"<<endl;
		cout<< "5. Display total revenue collected"<<endl;
		cout<< "6.Reset booth statistics"<<endl;
		cout<< "7.Exit"<<endl;
		cout<< "Enter your choice"<<endl;
		cin>>choice;

		switch(choice){
		case 1:
			booth.vehiclePayingToll(1,CAR_TOLL);
			break;
		case 2:
			booth.vehiclePayingToll(2,TRUCK_TOLL);
			break;
		case 3:
			booth.vehiclePayingToll(3,BUS_TOLL);
			break;
		case 4:
			cout<<"Total Vehicle:"<<booth.getTotalVehicle()<<endl;
			break;
		case 5:
			cout<<"Total Revenue"<<booth.getTotalVehicle()<<endl;
			break;
		case 6:
			booth.reset();
			break;
		case 7:
			cout<<"Exiting program..."<<endl;
			break;
		default:
			cout<<"Invalid choice! Try again"<<endl;
		break;
		}
	}while(choice !=7);



	return 0;
}
