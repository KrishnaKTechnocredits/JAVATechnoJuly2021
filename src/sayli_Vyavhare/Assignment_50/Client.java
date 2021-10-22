package sayli_Vyavhare.Assignment_50;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {

	public static void main(String[] args) {

		Builder builder1 = new Builder("Sayli", "ABCDE23232", 15, 100);
		Builder builder2 = new Builder("Akash", "DEFGH32323", 20, 75);
		Builder builder3 = new Builder("Atharv", "JKLMN25252", 20, 120);
		Builder builder4 = new Builder("Manoj", "GHIJK98989", 25, 150);
		Builder builder5 = new Builder("Sakshi", "MNOPQ48484", 15, 135);

		List<Builder> list = new ArrayList<Builder>();
		list.add(builder1);
		list.add(builder2);
		list.add(builder3);
		list.add(builder4);
		list.add(builder5);
		Collections.sort(list);
		System.out.println(list);

	}

}
