package inspections;

import java.util.Date;

public abstract class Inspection {
	String address;
	boolean approved;
	boolean open; //is the inspection still in analysis?
	Date date;			
}
