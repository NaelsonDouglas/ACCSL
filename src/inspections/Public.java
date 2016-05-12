package inspections;

import java.util.Date;
import java.util.Scanner;

import constructions.Commercial;
import global.GlobalInterface;

public class Public extends Inspection{
	String licitation;

	public Public(String address, String date, String licitation) {
		super(address, date);
		this.licitation = licitation;
	}

	public Public() {
		super();
	}
	
	public String toString() {
		return super.toString() + "\nLicitação: " + licitation;
	}

	public GlobalInterface create() {

		 Scanner scan = new Scanner(System.in);
		 String licitation;
		 
		 Public output = new Public();
		 output.superSet();	 
		 
		 System.out.println("Licitação: ");
		 licitation = scan.next();
		 
		 output.setLicitation(licitation);
		 
		 return output;
	}
	
	public String getLicitation() {
		return licitation;
	}

	public void setLicitation(String licitation) {
		this.licitation = licitation;
	}

	@Override
	public inspections.Inspection Inspection() {
		return new Public();
	}
	
}
