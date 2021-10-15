package amol_Vyas.Assignment_51;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Client {

	public static void main(String[] args) {
		Builder builder2 = new Builder("Amol", "ABS123", 4, 40000);
		Builder builder3 = new Builder("Ram", "BS123", 6, 12000);
		Builder builder1 = new Builder("Amol", "ABS123", 4, 2000);
		Builder builder4 = new Builder("Shyam", "TSBS123", 10, 100000);
		Builder builder5 = new Builder("Techno", "BSABS123", 9, 80000);

		List<Builder> List = new ArrayList();
		List.add(builder1);
		List.add(builder2);
		List.add(builder3);
		List.add(builder4);
		List.add(builder5);
		System.out.println(List);
		Collections.sort(List,new BuilderRevenue());
		System.out.println(List);
		Collections.sort(List,new BuilderTotalProjects());
		System.out.println(List);
		}

}
