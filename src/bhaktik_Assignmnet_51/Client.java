package bhaktik_Assignmnet_51;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
import java.util.TreeSet;



public class Client{
	public static void main(String[] args) {
		Builder builder1= new Builder("KolatePatil", "B100", 100, 123);
		Builder builder2= new Builder("Aditya", "A1234", 20, 5000);
		Builder builder3= new Builder("Moew", "B1235", 30, 2);
		Builder builder4= new Builder("Mahindra", "C1003", 2, 23);
		Builder builder5= new Builder("Patil", "C3456", 70, 4000);
	
		ArrayList<Builder> builderList= new ArrayList<Builder>();
		 
		builderList.add(builder1);
		builderList.add(builder2);
		builderList.add(builder3);
		builderList.add(builder4);
		builderList.add(builder5);
		
		Collections.sort(builderList, new BuilderSortRevenueComparator());
		System.out.println(builderList);
		Collections.sort(builderList, new BuilderSortTotalComplementedProject());
		System.out.println(builderList);
	
	}

}
