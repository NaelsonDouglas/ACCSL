package constructions;

import java.util.Date;

import com.sun.org.apache.bcel.internal.generic.GETSTATIC;

public class Public extends Construction{
	
	String licitationID;
	String publicOverseer;
	
	public Public(String client, String license, String startDate, String deadline,
			boolean done, String licitationID, String publicOverseer) {
		super(client, license, startDate, deadline, done);
		this.licitationID = licitationID;
		this.publicOverseer = publicOverseer;
	}	

	
	





	@Override
	public String toString() {
		return super.toString()+"\nLicitação: " + licitationID + "\nSupervisor Público: "
				+ publicOverseer;
	}























	public Public() {
		super();
				
	}


	@Override	
	public constructions.Construction Construction() {
		return new Public();
	}

	
	
	
}
