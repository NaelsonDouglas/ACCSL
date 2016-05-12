package optionals;

import java.util.ArrayList;
import java.util.Scanner;

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
			System.out.println("Length:");
			float lenght = input.nextFloat();
			System.out.println("Width:");
			float width = input.nextFloat();
			System.out.println("Deepness:");
			float deepness = input.nextFloat();
			Weir weir = new Weir(owner, lenght, width, deepness);
			arrayList.add(weir);
			break;

		case 1:
			Optional optional;
			for(int i = 0; i < arrayList.size(); i++) {
				optional = arrayList.get(i);
				
				if(!(optional instanceof Weir))
					continue;
				
				if(optional.owner == null)
					continue;
				
				weir = (Weir) arrayList.get(i);
				
				System.out.println("=========================");
				System.out.println("Owner: " + weir.owner);
				System.out.println("Length: " + weir.length);
				System.out.println("Width: " + weir.width);
				System.out.println("Deepness: " + weir.deepness);
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