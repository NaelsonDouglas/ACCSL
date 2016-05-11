package constructions;

import java.util.Date;

public class Commercial extends Construction {
	
	int commercialPermitId;

	
	public Commercial(String client, String license, Date startDate,
			Date deadline, boolean done, int commercialPermitId) {
		super(client, license, startDate, deadline, done);
		this.commercialPermitId = commercialPermitId;
	}
	
	public Commercial(){
		super();
		this.commercialPermitId = (Integer) null;
	}

	@Override
	public	constructions.Construction Construction() {
		return new Commercial();
	}

	
	
	
	
	
	
}
