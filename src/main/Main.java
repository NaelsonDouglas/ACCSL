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
	
	static ArrayList<Construction> construction = new ArrayList<Construction>();
	static ArrayList<Inspection> inspection = new ArrayList<Inspection>();
	static ArrayList<Rentail> rental = new ArrayList<Rentail>();
	static ArrayList<Optional> optional = new ArrayList<Optional>();
	static ArrayList<Payment> payment = new ArrayList<Payment>();
	static ArrayList<Reform> reform = new ArrayList<Reform>();
	static ArrayList<Resource> resource  = new ArrayList<Resource>();
	
	
	
	static Object[] variabilities = new Object[]{construction, inspection,rental,optional,payment,reform, resource};
	
	
	
	
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
	
		
		constructions.Construction x = new constructions.Industry();
		machine_rentails.Rentail y = new machine_rentails.Vehicle(); 
		 
		
		
		for (int i = 0; i < variabilities.length; i++){
			((ArrayList<Construction>) variabilities[1]).get(1);
		}
	
		
		
		
		
		
		
		
		
    }

}
