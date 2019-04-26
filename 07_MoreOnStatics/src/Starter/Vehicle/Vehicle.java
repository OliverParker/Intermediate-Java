package Starter.Vehicle;

import Starter.FactoryStuff.RegistrationPlate;
import Starter.FactoryStuff.RegistrationPlateFactory;

public class Vehicle {
	private int speed, lane;
	private static int count;
	RegistrationPlate registration;


	public Vehicle(int speed, int lane) {
		this.speed = speed;
		this.lane = lane;
		this.count = count++;
		registration = RegistrationPlateFactory.produceNextRegistrationPlate();
	}

	public void accelerate(int amt) {
		speed += amt;
		if (speed > 70) {
			speed = 70;
		}
	}

	public void brake(int amt) {
		speed -= amt;
		if (speed < 0) {
			speed = 0;
		}
	}z

	public String getDetails() {
		return String.format("%d,%d,%s", speed, lane, registration.getRegistrationNo());
	}

	public static int getCount() {
		return count;
	}

	
}
