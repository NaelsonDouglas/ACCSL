package machine_rentails;

import java.util.Date;

public class Heavy extends Rentail {
	String id;
	String driver;
	Integer license;
	public Heavy(Date start, Date end, Integer clientID, String clientName,
			String id, String driver, Integer license) {
		super(start, end, clientID, clientName);
		this.id = id;
		this.driver = driver;
		this.license = license;
	}
	public Heavy() {
		super();
	}
	@Override
	public machine_rentails.Rentail Rentail() {
		return new Heavy();
	}
	
	
	
		
}
