package reforms;

import java.util.Scanner;

import global.GlobalInterface;

public class Commercial extends Reform {
	Integer weekend;

	public Commercial(Integer weekend) {
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

	@Override
	public static GlobalInterface create() {
		Commercial output = new Commercial();
		output.superSet();
		
		Scanner scan = new Scanner(System.in);	
		output.setWeekend(scan.nextInt());
		
		
		return output;
	}

	public Integer getWeekend() {
		return weekend;
	}

	public void setWeekend(Integer weekend) {
		this.weekend = weekend;
	}
	
	
	
	
	
	
}
