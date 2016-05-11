package constructions;

import java.util.Date;

public class Industry extends Construction {
	boolean highPower; //industries whose demand a high power consumption
	boolean chemical;
	int engineerInChargeId;
	
	public Industry(String client, String license, Date startDate,
			Date deadline, boolean done, boolean highPower, boolean chemical,
			int engineerInChargeId) {
		super(client, license, startDate, deadline, done);
		this.highPower = highPower;
		this.chemical = chemical;
		this.engineerInChargeId = engineerInChargeId;
	}
	
	public Industry Industry(){
		return null;
	}
	

	@Override
	protected Construction makeFactory() {
		
		return null;
	}

	
	

}
