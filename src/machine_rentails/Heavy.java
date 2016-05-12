package machine_rentails;

import global.GlobalInterface;

import java.util.Date;

public class Heavy extends Rentail  {
	String id;
	String driver;
	Integer license;
	public Heavy(String start, String end, Integer clientID, String clientName,
			String id, String driver, Integer license) {
		super(start, end, clientName);
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
	@Override
	public String toString() {
		return this.toString()+"\nHeavy: " + id + "\nDriver" + driver + "\nLicence: "
				+ license;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public Integer getLicense() {
		return license;
	}
	public void setLicense(Integer license) {
		this.license = license;
	}
	@Override
	public GlobalInterface create() {
		Heavy output = new Heavy();
		
		output.superSet();
		
		System.out.println("Documento: ");

		
		return output;
	}
	
	
	
	
	
		
}
