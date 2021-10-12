package bhaktik_Assignment_50;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Client {
	public static void main(String[] args) {
		Builder builder1= new Builder("KolatePatil", "B100", 100, 123);
		Builder builder2= new Builder("Aditya", "A1234", 100, 5000);
		Builder builder3= new Builder("Moew", "B1235", 100, 2);
		Builder builder4= new Builder("Mahindra", "C1003", 100, 23);
		Builder builder5= new Builder("Patil", "C3456", 100, 4000);
	
		ArrayList<Builder> hm= new ArrayList<Builder>();
		 
		hm.add(builder1);
		hm.add(builder2);
		hm.add(builder3);
		hm.add(builder4);
		hm.add(builder5);
		
		Collections.sort(hm); //Collections.sort is applicable to only List not to set 
		System.out.println(hm);
	
	}

	
	
	
	
}
