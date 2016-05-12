package machine_rentails;

import java.util.Date;

public class Vehicle extends Rentail {
	Integer plate;
	Integer doors;
	boolean pickup;
	public Vehicle(Date start, Date end, Integer clientID, String clientName,
			Integer plate, Integer doors, boolean pickup) {
		super(start, end, clientID, clientName);
		this.plate = plate;
		this.doors = doors;
		this.pickup = pickup;
	}
	public Vehicle() {
		super();
	}
	@Override
	public machine_rentails.Rentail Rentail() {
		return new Vehicle();
	}
	
	
	
	
	
}
