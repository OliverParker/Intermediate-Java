package Starter.Main;

import java.util.ArrayList;

import Starter.Vehicle.Vehicle;

public class Program {

	public static void main(String[] args) {
		// Display count
		System.out.printf("Vehicle Count = %d \n\n", Vehicle.getCount());
		
		// Create ArrayList of Vehicle
		ArrayList<Vehicle> vehicles = new ArrayList<>();
		
		// Loop to create 7 vehicles
		 for (int i = 0; i < 8 ; i++) {
			 vehicles.add(new Vehicle(10+i, i%3 + 1));
		 }
		
		
		// Call accelerate or brake
		 for (int i = 0; i < vehicles.size() ; i++) {

		
		// Display details
		
		
		// Display count again
	}

}
