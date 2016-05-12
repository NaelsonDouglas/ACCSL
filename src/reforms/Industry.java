package reforms;

import global.GlobalInterface;

import java.util.Scanner;

public class Industry extends Reform {
	String heavyMachinery;

	public Industry(String heavyMachinery) {
		super();
		this.heavyMachinery = heavyMachinery;
	}

	public Industry() {
		super();
	}

	@Override
	public reforms.Reform Reform() {
		return new Industry();
	}

	@Override
	public String toString() {
		return this.toString()+"\nHeavy Machinery: " + heavyMachinery;
	}
	
	@Override
	public GlobalInterface create() {
		
		Scanner scan = new Scanner(System.in);		
		Industry output = new Industry();
		output.superSet();
		output.setHeavyMachinery(scan.next());		
		return output;
	}

	public String getHeavyMachinery() {
		return heavyMachinery;
	}

	public void setHeavyMachinery(String heavyMachinery) {
		this.heavyMachinery = heavyMachinery;
	}
	
	
	
}
