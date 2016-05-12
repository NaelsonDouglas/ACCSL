package optionals;

import java.util.ArrayList;
import java.util.Scanner;

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
	
	
	public void menu(ArrayList<Optional> arrayList) {
		System.out.println("[0] Adicionar");
		System.out.println("[1] Listar");
		System.out.println("[2] Remover");
		
		Scanner input = new Scanner(System.in);
		int selector = input.nextInt();
		input.nextLine();
		
		switch (selector) {
		case 0: 
			System.out.println("Owner:");
			String owner = input.nextLine();
			System.out.println("Depth:");
			float depth = input.nextFloat();
			Well well = new Well(owner, depth);
			arrayList.add(well);
			break;

		case 1:
			for(int i = 0; i < arrayList.size(); i++) {
				well = (Well) arrayList.get(i);
				if(well.owner == null)
					continue;
				System.out.println("=========================");
				System.out.println("Owner: " + well.owner);
				System.out.println("Depth: " + well.depth);
				System.out.println("=========================");
			}
			break;
		case 2:
			System.out.println("ID:");
			int id = input.nextInt();
			arrayList.remove(id);
			break;
		default:
			break;
		}
	}
	
	
}
