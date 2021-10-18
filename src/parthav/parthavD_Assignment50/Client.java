package parthav.parthavD_Assignment50;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		Builder builder1 = new Builder("Nirmal Ltd", "AABD008", 25, 10000);
		Builder builder2 = new Builder("Lodha Ltd", "ARTD008", 45, 20000);
		Builder builder3 = new Builder("Horizon Ltd", "BERTD009", 35, 15000);
		Builder builder4 = new Builder("Rustom Ltd", "WERTCE09", 35, 18000);
		Builder builder5 = new Builder("Gemini Ltd", "AWED008", 25, 22000);
		List<Builder> list = new ArrayList<Builder>();
		list.add(builder1);
		list.add(builder2);
		list.add(builder3);
		list.add(builder4);
		list.add(builder5);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);

	}

}
