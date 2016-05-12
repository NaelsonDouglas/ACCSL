package reforms;

import java.util.Scanner;

import global.GlobalInterface;

public class Public extends Reform {
	Integer licitation;

	public Public(Integer licitation) {
		super();
		this.licitation = licitation;
	}

	public Public() {
		super();
	}

	@Override
	public reforms.Reform Reform() {
		return new Public();
	}

	@Override
	public String toString() {
		return super.toString()+"\nLicitação: " + licitation;
	}

	@Override
	public GlobalInterface create() {
		
		Scanner scan = new Scanner(System.in);		
		Public output = new Public();
		output.superSet();
		output.setLicitation(scan.nextInt());		
		return output;
	}

	public Integer getLicitation() {
		return licitation;
	}

	public void setLicitation(Integer licitation) {
		this.licitation = licitation;
	}
	
	
	
	
}
