package inspections;

import java.util.Date;

public class Commercial extends Inspection{
	boolean atNight; //some commercial stablishments need to be inspected by the night, since it works everyday
	int governmentPermition;
	public Commercial(String address, boolean approved, boolean open,
			Date date, boolean atNight, int governmentPermition) {
		super(address, approved, open, date);
		this.atNight = atNight;
		this.governmentPermition = governmentPermition;
	}
	
	
	public Commercial() {
		super();
	}
	
	
	public Commercial(String address, boolean approved, boolean open, Date date) {
		super(address, approved, open, date);
	}
	
	public String toString(){
		return super.toString() + "\nNoturno: " + atNight + "\nAlvará: " + 
				governmentPermition;
	}
	
	@Override
	public inspections.Inspection Inspection() {
		return new Commercial();
	}
		
}
