package inspections;

import java.util.Date;

public class Public extends Inspection{
	String licitation;

	public Public(String address, boolean approved, boolean open, Date date,
			String licitation) {
		super(address, approved, open, date);
		this.licitation = licitation;
	}

	public Public() {
		super();
	}

	@Override
	public inspections.Inspection Inspection() {
		return new Public();
	}
	
	
	
	
	
	
}
