package reforms;

public class Industry extends Reform {
	boolean heavyMachinery;

	public Industry(boolean heavyMachinery) {
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
	
	
	
	
}
