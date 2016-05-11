package optionals;

public abstract class Optional {
	String owner;

	public Optional(String owner) {
		super();
		this.owner = owner;
	}

	public Optional() {
		super();
	}
	
	public abstract Optional Optional();
}
