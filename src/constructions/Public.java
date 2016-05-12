package constructions;

import global.GlobalInterface;

import java.util.Date;
import java.util.Scanner;

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


	public String getLicitationID() {
		return licitationID;
	}


	public void setLicitationID(String licitationID) {
		this.licitationID = licitationID;
	}


	public String getPublicOverseer() {
		return publicOverseer;
	}


	public void setPublicOverseer(String publicOverseer) {
		this.publicOverseer = publicOverseer;
	}


	@Override
	public GlobalInterface create() {

		Public output = new Public();
		output.superSet();
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Licitação: ");
		String licitation = scan.next();
		System.out.println("Fiscal público: ");
		publicOverseer = scan.next();
		
		output.setPublicOverseer(publicOverseer);
		output.setLicitationID(licitation);
		return output;
	}

	
	
	
}
