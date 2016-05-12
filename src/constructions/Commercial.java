package constructions;

public class Commercial extends Construction {
	
	int commercialPermitId;

	
	public Commercial(String client, String license, String startDate,
			String deadline, boolean done, int commercialPermitId) {
		super(client, license, startDate, deadline, done);
		this.commercialPermitId = commercialPermitId;
	}
	
	public Commercial(){
		super();
	}

	@Override
	public	constructions.Construction Construction() {
		return new Commercial();
	}

	@Override
	public String toString() {
		return super.toString()+"\nPermissão comercial: " + commercialPermitId;
	}

	
	
	
	
	
	
}
