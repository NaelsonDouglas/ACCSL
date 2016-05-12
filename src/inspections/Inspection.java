package inspections;

import global.GlobalInterface;

import java.util.Date;
import java.util.Scanner;

public abstract class Inspection implements GlobalInterface{
	String address;
	String date;
	
	public Inspection(String address, String date) {
		super();
		this.address = address;
		this.date = date;
	}		
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Inspection(){
		super();
		
	}
	
	public String toString() {
		return "Endereço: " + address + "\nData: " + date;
	}
	
	public void superSet(){
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Endereço: ");
		 address = scan.next();
		 System.out.println("Data: ");
		 date = scan.next();
		 
		 setAddress(address);
		 setDate(date);		 
	}
	
	public abstract Inspection Inspection();
	
}
