package resources;

public class Car extends Resource {
	String plate;
	String fuel;
	boolean functional;
	int garage_id;
	public Car(String plate, String fuel, boolean functional, int garage_id) {
		super();
		this.plate = plate;
		this.fuel = fuel;
		this.functional = functional;
		this.garage_id = garage_id;
	}
	public Car() {
		super();
	}
	@Override
	public resources.Resource Resource() {
		return new Car();
	}
	@Override
	public String toString() {
		return super.toString()+"\nPlaca: " + plate + "\nGasolina: " + fuel + "\nFuncional: "
				+ functional + "\nGaragem: " + garage_id + "]";
	}	
	
	
	
	
	
	
	
	
}
