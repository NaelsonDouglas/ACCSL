package optionals;

public class Well extends Optional  {
	Float depth;
	
	public Well() {
		super();
	}

	public Well(String owner, Float depth) {
		super(owner);
		this.depth = depth;
	}


	@Override
	public optionals.Optional Optional() {
		return new Well();
	}
	
	
}
