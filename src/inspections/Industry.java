package inspections;

import java.util.Date;

public class Industry extends Inspection {
	String engineerInCharge;
	boolean interditative; //Is there any need to stop the industry to call the inspection?
	Integer governementPermition;
	
	
	public Industry() {
		super();
	}


	public Industry(String address, boolean approved, boolean open, Date date,
			String engineerInCharge, boolean interditative,
			Integer governementPermition) {
		super(address, approved, open, date);
		this.engineerInCharge = engineerInCharge;
		this.interditative = interditative;
		this.governementPermition = governementPermition;
	}

	public String toString() {
		return super.toString() + "\nEngenheiro responsável: " + engineerInCharge +
				"\nInderditável: " + interditative + "\nAlvará do governo: " + 
				governementPermition;
	}

	@Override
	public inspections.Inspection Inspection() {
		return new Industry();
	}
		
}
