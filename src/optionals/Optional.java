package optionals;

import global.GlobalInterface;

import java.util.ArrayList;

public abstract class Optional implements GlobalInterface{
	String owner;

	public Optional(String owner) {
		super();
		this.owner = owner;
	}

	public Optional() {
		super();
	}
	
	public abstract Optional Optional();
	
	public abstract void menu(ArrayList<Optional> arrayList);
}
