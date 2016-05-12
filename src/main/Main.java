package main;

import inspections.Inspection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import com.sun.xml.internal.bind.v2.model.core.Ref;

import optionals.Optional;
import payments.Payment;
import reforms.Industry;
import reforms.Reform;
import resources.Resource;

import machine_rentails.Rentail;
import machine_rentails.Vehicle;

import constructions.Construction;
import constructions.Public;



public class Main {
	
	static ArrayList<Construction> constructions = new ArrayList<Construction>();
	static ArrayList<Inspection> inspections = new ArrayList<Inspection>();
	static ArrayList<Rentail> rentals = new ArrayList<Rentail>();
	static ArrayList<Optional> optionals = new ArrayList<Optional>();
	static ArrayList<Payment> payments = new ArrayList<Payment>();
	static ArrayList<Reform> reforms = new ArrayList<Reform>();
	static ArrayList<Resource> resources  = new ArrayList<Resource>();
	
	
	
	static Object[] variabilities = new Object[1];
	
	
	
	
	private static String getPackageName(Object obj){		
		return obj.getClass().getSuperclass().getSimpleName();		
	}
	
	
	
	
	
	  public static void createMenu() {
		  constructions.add(new constructions.Industry());
		  constructions.add(new constructions.Commercial());
		  constructions.add(new constructions.Public());
		  constructions.add(new constructions.Residence());
		  inspections.add(new inspections.Commercial());
		  inspections.add(new inspections.House());
		  inspections.add(new inspections.Industry());
		  inspections.add(new inspections.Public());
		  rentals.add(new machine_rentails.Heavy());
		  rentals.add(new machine_rentails.Vehicle());
		  optionals.add(new optionals.Weir());
		  optionals.add(new optionals.Well());
		  payments.add(new payments.Credit());
		  payments.add(new payments.Money());
		  reforms.add(new reforms.Commercial());
		  reforms.add(new reforms.House());
		  reforms.add(new reforms.Industry());
		  reforms.add(new reforms.Public());
		  resources.add(new resources.Building());
		  resources.add(new resources.Car());
		  
		  variabilities = new Object[]{constructions, inspections, rentals, optionals,
				  payments,reforms, resources};
	    }
	  
	  
	  
	
	public static void main(String[] args) {
	
		createMenu();
	
		
		
		
		
		
		
		
		
    }

}
