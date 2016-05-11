package optionals;

public class Weir extends Optional {
	Float length;
	Float width;
	Float deepness;
	public Weir(String owner, Float length, Float width, Float deepness) {
		super(owner);
		this.length = length;
		this.width = width;
		this.deepness = deepness;
	}
	public Weir() {
		super();
	}
	
	@Override
	public optionals.Optional Optional() {
		return new Weir();
	}	
	
	
}
