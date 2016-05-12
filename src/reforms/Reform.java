package reforms;

import global.GlobalInterface;

import java.util.Date;

public abstract class Reform implements GlobalInterface{
	String contact;
	Date begin;
	Date end;
	boolean ocupied;

	@Override
	public String toString() {
		return super.toString()+"\nContato: " + contact + "\nInício: " + begin + "\nFim: "
				+ end + "\nOcupado: " + ocupied;
	}

	public abstract Reform Reform();
}
