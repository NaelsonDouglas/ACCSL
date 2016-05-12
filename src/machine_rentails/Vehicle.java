package machine_rentails;

import global.GlobalInterface;

import java.util.Date;
import java.util.Scanner;

public class Vehicle extends Rentail {
	Integer plate;
	Integer doors;
	public Vehicle(String start, String end, Integer clientID, String clientName,
			Integer plate, Integer doors) {
		super(start, end,  clientName);
		this.plate = plate;
		this.doors = doors;
	}
	public Vehicle() {
		super();
	}
	@Override
	public machine_rentails.Rentail Rentail() {
		return new Vehicle();
	}
	@Override
	public String toString() {
		return super.toString()+"Plate: " + plate + "\nDoors: " + doors;
	}
	@Override
	public GlobalInterface create() {
		 Scanner scan = new Scanner(System.in);
		Vehicle output = new Vehicle();
		output.superSet();
		System.out.println("Placa: ");
		setPlate(scan.nextInt());
		System.out.println("Portas: ");
		setDoors(scan.nextInt());
		
		return output;
	}
	
	
	
	public Integer getPlate() {
		return plate;
	}
	public void setPlate(Integer plate) {
		this.plate = plate;
	}
	public Integer getDoors() {
		return doors;
	}
	public void setDoors(Integer doors) {
		this.doors = doors;
	}
	
	
	
	
	
	
}
