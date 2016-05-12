package machine_rentails;

import global.GlobalInterface;

import java.util.Date;
import java.util.Scanner;

public abstract  class Rentail implements GlobalInterface{
	String start;
	String end;
	String clientName;
	
	
	
	
	public Rentail(String start, String end, String clientName) {
		super();
		this.start = start;
		this.end = end;
		this.clientName = clientName;
	}



	public Rentail() {
		super();
	}
	
	

	@Override
	public String toString() {
		return "Start: " + start + "\n End: " + end + "\n Client name: " + clientName;
	}

	public void superSet(){
		
		Scanner scan = new Scanner(System.in);	
		
		System.out.println("Cliente");
		setClientName(scan.next());
		System.out.println("Começo: ");
		setStart(scan.next());
		
		System.out.println("Fim: ");
		setEnd(scan.next());
	}


	public String getStart() {
		return start;
	}



	public void setStart(String start) {
		this.start = start;
	}



	public String getEnd() {
		return end;
	}



	public void setEnd(String end) {
		this.end = end;
	}



	

	public String getClientName() {
		return clientName;
	}



	public void setClientName(String clientName) {
		this.clientName = clientName;
	}



	public abstract Rentail Rentail();
}
