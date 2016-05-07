package resources;

import java.util.ArrayList;

public abstract class resourceManagement {
	
	private static ArrayList<Resource> resources = new ArrayList<>();
	
	public static void add(Resource resource){
		resources.add(resource);
	}
	
	public static void remove(int index) {
		resources.remove(index);
	}
}
