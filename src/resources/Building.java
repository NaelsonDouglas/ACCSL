package resources;

public class Building extends Resource {
	String address;
	String dimensions;
	boolean rented;
	public Building(String address, String dimensions, boolean rented) {
		super();
		this.address = address;
		this.dimensions = dimensions;
		this.rented = rented;
	}
	public Building() {
		super();
	}
	@Override
	public resources.Resource Resource() {
		return new Building();
	}	
	
	
	
}
