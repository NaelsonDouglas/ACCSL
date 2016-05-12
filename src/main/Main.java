package main;

import global.GlobalInterface;
import inspections.Inspection;

import java.awt.Menu;
import java.io.Console;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.crypto.Data;

import com.sun.xml.internal.bind.v2.model.core.Ref;

import optionals.Optional;
import payments.Money;
import payments.Payment;
import reforms.Commercial;
import reforms.Industry;
import reforms.Reform;
import resources.Resource;
import sun.org.mozilla.javascript.ScriptableObject;
import sun.org.mozilla.javascript.tools.shell.Global;
import sun.security.action.GetLongAction;

import machine_rentails.Rentail;
import machine_rentails.Vehicle;

import constructions.Construction;
import constructions.Public;
import constructions.Residence;



public class Main {
	
	public static ArrayList<Construction> constructions = new ArrayList<Construction>();
	public static ArrayList<Inspection> inspections = new ArrayList<Inspection>();
	public static ArrayList<Rentail> rentals = new ArrayList<Rentail>();
	public static ArrayList<Optional> optionals = new ArrayList<Optional>();
	public static ArrayList<Payment> payments = new ArrayList<Payment>();
	public static ArrayList<Reform> reforms = new ArrayList<Reform>();
	public static ArrayList<Resource> resources  = new ArrayList<Resource>();
	
	
	
	static Object[] variabilities = new GlobalInterface[1];
	static Object[] data = new ArrayList[variabilities.length];
	
	
	
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
		  
		  variabilities = new Object[]{constructions, inspections, rentals, optionals, payments,reforms, resources};
		  
		  for (int i=0; i < data.length; i++){
			  data[i] = new ArrayList<Object>();
		  }
		  
	    }  
	  	  
	  static void include(int variability, int vPoint){
			GlobalInterface factory = ((ArrayList<Construction>) variabilities[variability]).get(vPoint);
			GlobalInterface newInstance = factory.create();		
			((ArrayList<GlobalInterface>) data[variability]).add(newInstance);		
			
		}
	  
	  static void menu() {
		  for(int i = 0; i < variabilities.length; i++) {
			  System.out.println("[" + i + "] " + getPackageName(((ArrayList) variabilities[i]).get(0)));
		  }
		  
		  //Scanner input = new Scanner(System.in);
		 // subMenu(input.nextInt());
	  }
	  
	  static void subMenu(int selec) {
		  
		  Integer size =  ((ArrayList) variabilities[selec]).size();
		  System.out.println("size "+size);
		  for(int i = 0; i < size; i++) {
			  Object sublist = ((ArrayList) variabilities[selec]).get(i);
			  
			  System.out.println("[" + i + "] " + sublist.getClass().getSimpleName());			  	  
		  }  
		  
		  Scanner inn_select = new Scanner(System.in);		  
		  int id = inn_select.nextInt();		  
		  include(selec,id);
	  }
	  
	  static void mode(){
		  System.out.println("[0] New");
		  System.out.println("[1] List\n");		  
		  Scanner scan = new Scanner(System.in);		  
		  Integer modeSelect = scan.nextInt();
		  
		  menu();
		  int variab = scan.nextInt();
		  if (modeSelect == 0){
			  subMenu(variab);
			  
		  }else if (modeSelect == 1){
			  list(variab);
		  }
		
		  
		  
		  
	  }
	  static void list(int variability){
		  Integer size = ((ArrayList) data[variability]).size();
		  for (int i=0; i<size; i++){
			  System.out.println(((ArrayList) data[variability]).get(i).toString());
			  System.out.println();
		  }
	  }
	  
	  
	  
	  
	  
	public static void main(String[] args) {
	createMenu();
	while(true){
		mode();
	}
	
	
				
	}				
}


