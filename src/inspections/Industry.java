package inspections;

import java.util.Date;
import java.util.Scanner;

import global.GlobalInterface;

public class Industry extends Inspection {
	String engineerInCharge;
	Integer governmentPermition;
	
	
	public Industry() {
		super();
	}


	public Industry(String address, String date,
			String engineerInCharge, boolean interditative,
			Integer governementPermition) {
		super(address, date);
		this.engineerInCharge = engineerInCharge;
		this.governmentPermition = governementPermition;
	}

	public String toString() {
		return super.toString() + "\nEngenheiro responsável: " + engineerInCharge +
				"\nAlvará do governo: " + governmentPermition;
	}

	public GlobalInterface create() {

		 Scanner scan = new Scanner(System.in);
		 String engineerInCharge;
		 Integer governmentPermission;
		 
		 Industry output = new Industry();
		 output.superSet();	 
		 
		 System.out.println("Engenheiro responsável: ");
		 engineerInCharge = scan.next();
		 System.out.println("Alvará: ");
		 governmentPermission = scan.nextInt();
		 
		 output.setEngineerInCharge(engineerInCharge);
		 output.setGovernmentPermition(governmentPermission);
		 
		 return output;
	}
	
	public String getEngineerInCharge() {
		return engineerInCharge;
	}


	public void setEngineerInCharge(String engineerInCharge) {
		this.engineerInCharge = engineerInCharge;
	}


	public Integer getGovernmentPermition() {
		return governmentPermition;
	}


	public void setGovernmentPermition(Integer governmentPermition) {
		this.governmentPermition = governmentPermition;
	}


	@Override
	public inspections.Inspection Inspection() {
		return new Industry();
	}
		
}
