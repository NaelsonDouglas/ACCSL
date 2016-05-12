package optionals;

import java.util.ArrayList;
import java.util.Scanner;

import global.GlobalInterface;
import inspections.Public;

public class Weir extends Optional {
	Float length;
	Float width;
	Float deepness;
	public Weir(String owner, Float length, Float width, Float deepness) {
		super(owner);
		this.length = length;
		this.width = width;
		this.deepness = deepness;
	}
	public Weir() {
		super();
	}
	
	public String toString() {
		return super.toString() + "\nComprimento: " + length + "\nLargura: " +
				width + "Profundidade: " + deepness;
	}
	
	public GlobalInterface create() {

		 Scanner scan = new Scanner(System.in);
		 Float length, width, deepness;
		 
		 Weir output = new Weir();
		 output.superSet();	 
		 
		 System.out.println("Comprimento: ");
		 length = scan.nextFloat();
		 System.out.println("Largura: ");
		 width = scan.nextFloat();
		 System.out.println("Profundidade: ");
		 deepness = scan.nextFloat();		 
		 
		 output.setLength(length);
		 output.setWidth(width);
		 output.setDeepness(deepness);
		 
		 return output;
	}
	
	public Float getLength() {
		return length;
	}
	public void setLength(Float length) {
		this.length = length;
	}
	public Float getWidth() {
		return width;
	}
	public void setWidth(Float width) {
		this.width = width;
	}
	public Float getDeepness() {
		return deepness;
	}
	public void setDeepness(Float deepness) {
		this.deepness = deepness;
	}
	@Override
	public optionals.Optional Optional() {
		return new Weir();
	}	
	
}