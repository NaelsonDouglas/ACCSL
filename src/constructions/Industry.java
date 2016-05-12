package constructions;

import global.GlobalInterface;

import java.util.Date;
import java.util.Scanner;

public class Industry extends Construction {
	String type;
	int engineerInChargeId;
	
	public Industry(String client, String license, String startDate,
			String deadline, boolean done, String type,
			int engineerInChargeId) {
		super(client, license, startDate, deadline, done);		
		this.type = type;
		this.engineerInChargeId = engineerInChargeId;
	}
	
	public Industry(){
		super();
		
		
	}
	
	
	public Construction Construction(){		
		Construction output =  new Industry();
		return output;		
	}

	@Override
	public String toString() {
		return super.toString() + "\nTipo: " + type
				+ "\nEngineer in charge: " + engineerInChargeId;
	}

	@Override
	public GlobalInterface create() {
		Industry output = new Industry();
		output.superSet();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Tipo: ");
		type = scan.next();
		System.out.println("ID do engenheiro: ");
		engineerInChargeId = scan.nextInt();
		output.setEngineerInChargeId(engineerInChargeId);
		setType(type);
		
		
		
		
		return output;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getEngineerInChargeId() {
		return engineerInChargeId;
	}

	public void setEngineerInChargeId(int engineerInChargeId) {
		this.engineerInChargeId = engineerInChargeId;
	}
	

	

	
	

}
