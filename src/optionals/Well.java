package optionals;

import java.util.ArrayList;
import java.util.Scanner;

import global.GlobalInterface;

public class Well extends Optional  {
	Float depth;
	
	public Well() {
		super();
	}

	public Well(String owner, Float depth) {
		super(owner);
		this.depth = depth;
	}

	public String toString() {
		return super.toString() + "\nProfundidade: " + depth;
	}
	
	public GlobalInterface create() {

		 Scanner scan = new Scanner(System.in);
		 Float depth;
		 
		 Well output = new Well();
		 output.superSet();	 
		 
		 System.out.println("Profundidade: ");
		 depth = scan.nextFloat();		 
		 
		 output.setDepth(depth);
		 
		 return output;
	}

	public Float getDepth() {
		return depth;
	}

	public void setDepth(Float depth) {
		this.depth = depth;
	}

	@Override
	public optionals.Optional Optional() {
		return new Well();
	}
		
}
