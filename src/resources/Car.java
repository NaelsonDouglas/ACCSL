package resources;

import java.util.Scanner;

import global.GlobalInterface;

public class Car extends Resource {
	String plate;
	
	public Car(String plate) {
		super();
		this.plate = plate;
	}
	public Car() {
		super();
	}
	@Override
	public resources.Resource Resource() {
		return new Car();
	}
	@Override
	public String toString() {
		return super.toString()+"\nPlaca: " + plate ;
	}
	@Override
	public GlobalInterface create() {
		Car output = new Car();
		output.superSet();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Placa: ");
		setPlate(scan.next());
		
		
		
		
		return output;
	}
	
	
	
	public String getPlate() {
		return plate;
	}
	public void setPlate(String plate) {
		this.plate = plate;
	}
	
	
	
	
	
	
	
	
}
