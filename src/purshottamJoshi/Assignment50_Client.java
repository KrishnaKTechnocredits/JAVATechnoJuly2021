package purshottamJoshi;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment50_Client {
	
	public static void main(String[] args) {
		Assignment50_Builder builder1 = new Assignment50_Builder("DSK", "JHKLM34587K", 70, 900000);
		Assignment50_Builder builder2 = new Assignment50_Builder("DREAMS", "PGHBN1978F", 10, 700000);
		Assignment50_Builder builder3 = new Assignment50_Builder("JW", "GHZPJ7769P", 30, 350000);
		Assignment50_Builder builder4 = new Assignment50_Builder("KUMAR", "DDUP7769Q", 45, 550000);
		Assignment50_Builder builder5 = new Assignment50_Builder("DSK", "JHKLM34587K", 70, 900000);

		ArrayList<Assignment50_Builder> list = new ArrayList<>();
		list.add(builder1);
		list.add(builder2);
		list.add(builder3);
		list.add(builder4);
		list.add(builder5);
		Collections.sort(list);
		System.out.println("Sorted List: " + list);
	}

}
