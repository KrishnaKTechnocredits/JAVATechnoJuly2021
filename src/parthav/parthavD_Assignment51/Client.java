package parthav.parthavD_Assignment51;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		Builder builder1 = new Builder("Nirmal Ltd", "AABD008", 25, 10000);
		Builder builder2 = new Builder("Lodha Ltd", "ARTD008", 45, 9000);
		Builder builder3 = new Builder("Horizon Ltd", "BERTD009", 35, 15000);
		Builder builder4 = new Builder("Rustom Ltd", "WERTCE09", 32, 11000);
		Builder builder5 = new Builder("Gemini Ltd", "AFED008", 22, 5000);
		List<Builder> list = new ArrayList<Builder>();
		list.add(builder1);
		list.add(builder2);
		list.add(builder3);
		list.add(builder4);
		list.add(builder5);
		System.out.println("Original List without sorting");
		System.out.println(list);
		System.out.println("Original List with Revenue based sorting");
		Collections.sort(list, new RevenueComparator());
		System.out.println(list);
		System.out.println("Original List with descending order Total Completed Projects based sorting");
		Collections.sort(list, Collections.reverseOrder(new CompletedProjectComparator()));
		System.out.println(list);
	}

}
