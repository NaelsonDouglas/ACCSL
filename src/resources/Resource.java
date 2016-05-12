package resources;

import global.GlobalInterface;

import java.util.Date;

public abstract class Resource implements GlobalInterface{
	String name;
	String documment;
	Date bought;
	boolean avaliable;	
	
	
	
	
	@Override
	public String toString() {
		return "Nome: " + name + "Documento: " + documment
				+ "Data Compra: " + bought + "\nDisponível: " + avaliable + "]";
	}




	public abstract Resource Resource();
}
