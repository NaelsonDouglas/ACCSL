package machine_rentails;

import java.util.Date;

public abstract  class Rentail{
	Date start;
	Date end;
	Integer clientID;
	String clientName;
	
	
	
	
	public Rentail(Date start, Date end, Integer clientID, String clientName) {
		super();
		this.start = start;
		this.end = end;
		this.clientID = clientID;
		this.clientName = clientName;
	}



	public Rentail() {
		super();
	}
	
	

	@Override
	public String toString() {
		return "Start: " + start + "\n End: " + end + "\nClient ID: "
				+ clientID + "\n Client name: " + clientName;
	}



	public abstract Rentail Rentail();
}
