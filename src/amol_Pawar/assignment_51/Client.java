package amol_Pawar.assignment_51;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		Builder builder=new Builder("Amol", "GST12", 3, 1000);
		Builder builder1=new Builder("Rahul", "GST14", 1, 3000);
		Builder builder2=new Builder("Sham", "GST11",4, 2000);
		Builder builder3=new Builder("Sanket", "GST15", 2, 10000);
		Builder builder4=new Builder("Ankit", "GST12", 5, 4000);
		
		List list=new ArrayList();
		list.add(builder);
		list.add(builder1);
		list.add(builder2);
		list.add(builder3);
		list.add(builder4);
		System.out.println("Sorting with Revenue ");
		Collections.sort(list, new BuilderRevenue());
		System.out.println(list);
		System.out.println();
		System.out.println("Sorting with Project");
		Collections.sort(list, new BuilderTotalProjects());
		System.out.println(list);

	}

}
