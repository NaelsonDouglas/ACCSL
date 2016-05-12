package optionals;

import global.GlobalInterface;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Optional implements GlobalInterface{
	String owner;

	public Optional(String owner) {
		super();
		this.owner = owner;
	}

	public Optional() {
		super();
	}
	
	public String toString() {
		return "Dono: " + owner;
	}
	
	public void superSet(){
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Dono: ");
		 owner = scan.next();
		 
		 setOwner(owner);	 
	}
	
	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public abstract Optional Optional();
	
}
