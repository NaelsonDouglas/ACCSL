package reforms;

public class Commercial extends Reform {
	boolean weekend;

	public Commercial(boolean weekend) {
		super();
		this.weekend = weekend;
	}

	public Commercial() {
		super();
	}

	@Override
	public reforms.Reform Reform() {
		return new Commercial();
	}

	@Override
	public String toString() {
		return super.toString()+"Trabalhoem fim de semana: " + weekend;
	}
	
	
	
}
