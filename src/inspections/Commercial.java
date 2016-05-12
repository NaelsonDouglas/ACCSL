package inspections;

import java.util.Date;
import java.util.Scanner;

import global.GlobalInterface;

public class Commercial extends Inspection{
	int governmentPermition;
	
	public Commercial(String address, String date, int governmentPermition) {
		super(address, date);
		this.governmentPermition = governmentPermition;
	}
	
	
	public Commercial() {
		super();
	}
	
	
	public Commercial(String address, String date) {
		super(address, date);
	}
	
	public String toString(){
		return super.toString() + "\nAlvará: " + governmentPermition;
	}
	
	public GlobalInterface create() {

		 Scanner scan = new Scanner(System.in);
		 int governmentPermition;
		 
		 Commercial output = new Commercial();
		 output.superSet();	 
		 
		 System.out.println("Alvará: ");
		 governmentPermition = scan.nextInt();
		 
		 output.setGovernmentPermition(governmentPermition);
		 
		 return output;
	}
	
	public int getGovernmentPermition() {
		return governmentPermition;
	}


	public void setGovernmentPermition(int governmentPermition) {
		this.governmentPermition = governmentPermition;
	}


	@Override
	public inspections.Inspection Inspection() {
		return new Commercial();
	}
		
}
