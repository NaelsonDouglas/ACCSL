package reforms;

import java.util.Scanner;

import global.GlobalInterface;

public class House extends Reform {
	String noiseRestritive;

	public House(String noiseRestritive) {
		super();
		this.noiseRestritive = noiseRestritive;
	}

	public House() {
		super();
	}

	@Override
	public reforms.Reform Reform() {
		return new House();
	}

	@Override
	public String toString() {
		return super.toString()+"\nNoise Restritive: " + noiseRestritive;
	}

	
	@Override
	public GlobalInterface create() {

		House output = new House();
		output.superSet();
		Scanner scan = new Scanner(System.in);	
		output.setNoiseRestritive(scan.next());
		return output;
	}

	public String isNoiseRestritive() {
		return noiseRestritive;
	}

	public void setNoiseRestritive(String noiseRestritive) {
		this.noiseRestritive = noiseRestritive;
	}	
	
	
	
	
}
