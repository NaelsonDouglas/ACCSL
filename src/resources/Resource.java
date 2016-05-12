package resources;

import global.GlobalInterface;

import java.util.Date;
import java.util.Scanner;

public abstract class Resource implements GlobalInterface{
	String name;
	String documment;
	String bought;
	String avaliable;	
	
	
	
	
	@Override
	public String toString() {
		return "Nome: " + name + "Documento: " + documment
				+ "Data Compra: " + bought + "\nDisponível: " + avaliable + "]";
	}

public void superSet(){
	Scanner scan = new Scanner(System.in);	
	System.out.println("Nome: ");
	setName(scan.next());
	System.out.println("Docuemnto: ");
	setDocumment(scan.next());
	System.out.println("Data Compra: ");
	setBought(scan.next());
	System.out.println("Disponível: ");
	setAvaliable(scan.next());
}



	public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDocumment() {
	return documment;
}

public void setDocumment(String documment) {
	this.documment = documment;
}

public String getBought() {
	return bought;
}

public void setBought(String bought) {
	this.bought = bought;
}

public String getAvaliable() {
	return avaliable;
}

public void setAvaliable(String avaliable) {
	this.avaliable = avaliable;
}

	public abstract Resource Resource();
}
