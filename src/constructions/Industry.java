package constructions;

import java.util.Date;

public class Industry extends Construction {
	boolean highPower; //industries whose demand a high power consumption
	boolean chemical;
	int engineerInChargeId;
	
	public Industry(String client, String license, String startDate,
			String deadline, boolean done, boolean highPower, boolean chemical,
			int engineerInChargeId) {
		super(client, license, startDate, deadline, done);
		this.highPower = highPower;
		this.chemical = chemical;
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
		return super.toString()+"High power: " + highPower + "\nChemical: " + chemical
				+ "\nEngineer in charge: " + engineerInChargeId + "]";
	}
	

	

	
	

}
