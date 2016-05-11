package reforms;

public class Public extends Reform {
	Integer licitation;

	public Public(Integer licitation) {
		super();
		this.licitation = licitation;
	}

	public Public() {
		super();
	}

	@Override
	public reforms.Reform Reform() {
		return new Public();
	}
	
	
	
}
