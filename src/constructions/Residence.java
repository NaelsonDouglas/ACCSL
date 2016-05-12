package constructions;

import global.GlobalInterface;

import java.util.Date;
import java.util.Scanner;

public class Residence extends Construction {
	
	String owner;
	String grade; //grade A, B, C or D -- It is a way to classifie the value of houses
	
	public Residence(String client, String license, String startDate,
			String deadline, boolean done, String owner, boolean garage,
			boolean pool, String grade) {
		super(client, license, startDate, deadline, done);
		this.owner = owner;
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
		return super.toString()+"\nOwner: " + owner + "\nGarate: " + "\nGrade: " + grade;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public GlobalInterface create() {
		Residence output = new Residence();
		output.superSet();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Owner: ");
		owner = scan.next();
		System.out.println("Grade: ");
		grade = scan.next();
		
		output.setOwner(owner);
		output.setGrade(grade);		
		return output;
	}

	
	
	
	
	
		
	
	
}
