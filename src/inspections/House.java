package inspections;

import java.util.Date;
import java.util.Scanner;

import global.GlobalInterface;

public class House extends Inspection {
	String owner;

	public House(String address,  String date,
			String owner) {
		super(address, date);
		this.owner = owner;
	}
	
	
	public House() {
		super();
	}

	public String toString() {
		return super.toString() + "\nDono: " + owner;
	}

	public GlobalInterface create() {

		 Scanner scan = new Scanner(System.in);
		 String owner;
		 
		 House output = new House();
		 output.superSet();	 
		 
		 System.out.println("Dono: ");
		 owner = scan.next();
		 
		 output.setOwner(owner);
		 
		 return output;
	}
	
	public String getOwner() {
		return owner;
	}



	public void setOwner(String owner) {
		this.owner = owner;
	}



	@Override
	public inspections.Inspection Inspection() {
		return new House();
	}
	
}
