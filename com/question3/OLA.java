package com.question3;

public class OLA {
	
	
	
	public Car bookCar(int numberOfPassenger, int numberOfKMs) {
		
		if(numberOfPassenger<=3) {
			HatchBack hb =new HatchBack();
			hb.numberOfPassenger=numberOfPassenger;
			hb.numberOfKms=numberOfKMs;
			hb.getfarekm();
			return hb;
		}else {
			Sedan sd=new Sedan();
			sd.numberOfPassenger=numberOfPassenger;
			sd.numberOfKms=numberOfKMs;
			sd.getfarekm();
			return sd;
			
		}
	}

	public int calculateBill(Car car) {
		int Totalfare=car.numberOfKms*car.getfarekm();
		return  Totalfare;
		
	}

}
