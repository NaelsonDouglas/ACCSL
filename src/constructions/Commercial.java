package constructions;

import java.util.Scanner;

import global.GlobalInterface;

public class Commercial extends Construction {
	
	int commercialPermitId;

	
	public Commercial(String client, String license, String startDate,
			String deadline, boolean done, int commercialPermitId) {
		super(client, license, startDate, deadline, done);
		this.commercialPermitId = commercialPermitId;
	}
	
	public Commercial(){
		super();
	}

	@Override
	public	constructions.Construction Construction() {
		return new Commercial();
	}

	@Override
	public String toString() {
		return super.toString()+"\nPermissão comercial: " + commercialPermitId;
	}

	@Override
	public GlobalInterface create() {

		 Scanner scan = new Scanner(System.in);
		 String client,license,startDate,deadline;
		 int commercialPermit;
		 
		 Commercial output = new Commercial();
		 output.superSet();	 
		 
		 System.out.println("Permit ID: ");
		 commercialPermit = scan.nextInt();
		 
		 output.setCommercialPermitId(commercialPermit);
		 
		 return output;
	}

	
	public int getCommercialPermitId() {
		return commercialPermitId;
	}

	public void setCommercialPermitId(int commercialPermitId) {
		this.commercialPermitId = commercialPermitId;
	}

	
	
	
	
	
	
	
}
