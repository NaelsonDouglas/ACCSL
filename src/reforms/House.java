package reforms;

public class House extends Reform {
	boolean noiseRestritive;

	public House(boolean noiseRestritive) {
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
	
	
	
}
