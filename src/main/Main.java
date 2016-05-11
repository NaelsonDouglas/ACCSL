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
import machine_rentails.Vehicles;

import constructions.Construction;
import constructions.Public;



public class Main {
	
	ArrayList<Construction> constructions = new ArrayList<Construction>();
	ArrayList<Inspection> inspections = new ArrayList<Inspection>();
	ArrayList<Rentail> rentails = new ArrayList<Rentail>();
	ArrayList<Optional> optionals = new ArrayList<Optional>();
	ArrayList<Payment> payments = new ArrayList<Payment>();
	ArrayList<Reform> reforms = new ArrayList<Reform>();
	ArrayList<Resource> resources  = new ArrayList<Resource>();
	
	Object[] variabilities = new Object[]{constructions, inspections,rentails,optionals,payments,reforms, resources};
	
	
	
	
	private static String getPackageName(Object obj){		
		return obj.getClass().getSuperclass().getSimpleName();		
	}
	
	
	
	
	
	  public static int menu() {

	        int selection;
	        Scanner input = new Scanner(System.in);      
	        System.out.println("Choose from these choices");   
	        selection = input.nextInt();
	        return selection;    
	    }
	  
	  
	  
	
	public static void main(String[] args) {
	
		
		
		
		
	
		
		
		
		
		
		
		
		
    }

}
