package resources;

import java.util.Scanner;

import global.GlobalInterface;

public class Building extends Resource {
	String address;
	Integer dimensions;
	public Building(String address, Integer dimensions) {
		super();
		this.address = address;
		this.dimensions = dimensions;
	}
	public Building() {
		super();
	}
	@Override
	public resources.Resource Resource() {
		return new Building();
	}
	@Override
	public String toString() {
		return super.toString()+"\nEndereço: " + address + "\nÁrea: " + dimensions;
	}
	@Override
	public GlobalInterface create() {
		Scanner scan = new Scanner(System.in);
		
		
		Building output = new Building();
		
		System.out.println("Enderenço: ");
		setAvaliable(scan.next());
		
		System.out.println("Área: ");
		setDimensions(scan.nextInt());
		return output;
	}
	
	
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getDimensions() {
		return dimensions;
	}
	public void setDimensions(Integer dimensions) {
		this.dimensions = dimensions;
	}	
	
	
	
}
