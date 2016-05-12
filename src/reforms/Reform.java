package reforms;

import global.GlobalInterface;

import java.util.Date;
import java.util.Scanner;

public abstract class Reform implements GlobalInterface{
	String contact;
	String begin;
	String end;

	@Override
	public String toString() {
		return super.toString()+"\nContato: " + contact + "\nInício: " + begin + "\nFim: "
				+ end ;
	}

	
	public void superSet(){
		Scanner scan = new Scanner(System.in);		
		System.out.println("Contact: ");	
		setContact(scan.next());
		System.out.println("Begin: ");
		setBegin(scan.next());
		System.out.println("End: ");
		setEnd(scan.next());	
		
	}
	
	
	public String getContact() {
		return contact;
	}



	public void setContact(String contact) {
		this.contact = contact;
	}



	public String getBegin() {
		return begin;
	}



	public void setBegin(String begin) {
		this.begin = begin;
	}



	public String getEnd() {
		return end;
	}



	public void setEnd(String end) {
		this.end = end;
	}



	public abstract Reform Reform();
}
