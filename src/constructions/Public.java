package constructions;

import java.util.Date;

public class Public extends Construction{
	
	String licitationID;
	String publicOverseer;
	
	public Public(String client, String license, Date startDate, Date deadline,
			boolean done, String licitationID, String publicOverseer) {
		super(client, license, startDate, deadline, done);
		this.licitationID = licitationID;
		this.publicOverseer = publicOverseer;
	}
	
	
	
	
	
	
	
}
