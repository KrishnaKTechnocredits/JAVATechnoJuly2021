package purshottamJoshi;

import java.util.HashSet;

public class Assignment49_Client {

	public static void main(String[] args) {
		Assignment49_Builder builder1 = new Assignment49_Builder("DSK", "JHKLM34587K", 70, 900000);
		Assignment49_Builder builder2 = new Assignment49_Builder("DREAMS", "PGHBN1978F", 10, 700000);
		Assignment49_Builder builder3 = new Assignment49_Builder("JW", "GHZPJ7769P", 30, 350000);
		Assignment49_Builder builder4 = new Assignment49_Builder("KUMAR", "DDUP7769Q", 45, 550000);
		Assignment49_Builder builder5 = new Assignment49_Builder("DSK", "JHKLM34587K", 70, 900000);
		HashSet<Assignment49_Builder> set = new HashSet<>();
		set.add(builder1);
		set.add(builder2);
		set.add(builder3);
		set.add(builder4);
		set.add(builder5);
		System.out.println("size of set : "+set.size());
		
	}

}
