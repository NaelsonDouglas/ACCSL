package constructions;

import java.util.Date;

public abstract class Construction {
	
	String client;
	String license;
	Date startDate;
	Date deadline;
	boolean done;
	
	
	
	public Construction(String client, String license, Date startDate,
			Date deadline, boolean done) {
		super();
		this.client = client;
		this.license = license;
		this.startDate = startDate;
		this.deadline = deadline;
		this.done = done;
	}
	
	
	public Construction() {
		super();		
	}
	
	
	public abstract Construction Construction();
	
	
}
