package inspections;

import java.util.Date;

public class House extends Inspection {
	String owner;
	boolean occupied; //Is there anyone living in the  house?
	public House(String address, boolean approved, boolean open, Date date,
			String owner, boolean ocupied) {
		super(address, approved, open, date);
		this.owner = owner;
		this.occupied = ocupied;
	}
	
	
	
	public House() {
		super();
	}



	public House(String address, boolean approved, boolean open, Date date) {
		super(address, approved, open, date);
	}

	public String toString() {
		return super.toString() + "\nDono: " + owner + "\nOcupada: " + occupied;
	}

	@Override
	public inspections.Inspection Inspection() {
		return new House();
	}
	
}
