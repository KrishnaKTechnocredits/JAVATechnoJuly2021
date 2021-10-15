package amol_Vyas.Assignment_49;

import java.util.HashSet;
import java.util.Set;

public class Client {
	
	public static void main(String[] args) {
		Builder builder1 = new Builder("Amol", "ABS123", 4, 10000);
		Builder builder2= new Builder("Amol", "ABS123", 4, 10000);
		Builder builder3 = new Builder("Ram", "BS123", 6, 20000);
		Builder builder4 = new Builder("Shyam", "TSBS123", 10, 100000);
		Builder builder5 = new Builder("Techno", "BSABS123", 9, 80000);
		
		Set<Builder> set = new HashSet();
		set.add(builder1);
		set.add(builder2);
		set.add(builder3);
		set.add(builder4);
		set.add(builder5);
		System.out.println("Size of Set is "+set.size());
	}

}
