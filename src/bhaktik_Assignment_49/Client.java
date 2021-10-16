package bhaktik_Assignment_49;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Client {
	public static void main(String[] args) {
		Builder builder1= new Builder("KolatePatil", "B100", 100, 2345);
		Builder builder2= new Builder("Aditya", "A1234", 100, 2345);
		Builder builder3= new Builder("Moew", "B1235", 100, 2345);
		Builder builder4= new Builder("Mahindra", "C1003", 100, 2345);
		Builder builder5= new Builder("KolatePatil", "B100", 100, 2345);
		System.out.println(builder1.hashCode());
		System.out.println(builder5.hashCode());
		
		
		HashSet hm= new HashSet();
		hm.add(builder1);
		hm.add(builder2);
		hm.add(builder3);
		hm.add(builder4);
		hm.add(builder5);
		hm.add(builder5);
		
		System.out.println(hm.size());
		System.out.println(hm);
		
		 
		
		
		
	}

}
