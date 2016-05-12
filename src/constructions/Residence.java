package constructions;

import java.util.Date;

public class Residence extends Construction {
	
	String owner;
	boolean garage;
	boolean pool;
	String grade; //grade A, B, C or D -- It is a way to classifie the value of houses
	
	public Residence(String client, String license, String startDate,
			String deadline, boolean done, String owner, boolean garage,
			boolean pool, String grade) {
		super(client, license, startDate, deadline, done);
		this.owner = owner;
		this.garage = garage;
		this.pool = pool;
		this.grade = grade;
	}
	
	public Residence() {
		super();
	
	}

	@Override
	
	public constructions.Construction Construction() {
		// TODO Auto-generated method stub
		return new Residence();
	}

	@Override
	public String toString() {
		return super.toString()+"\nOwner: " + owner + "\nGarate: " + garage + "\nPool: "
				+ pool + "\nGrade: " + grade;
	}

	
	
	
	
	
		
	
	
}
