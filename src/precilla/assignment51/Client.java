package precilla.assignment51;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Client implements Comparator<Builder>{
	public static void main(String[] args) {
		Builder builder1=new Builder("Precilla",5678,3,2000);
		Builder builder2=new Builder("Precilla",5678,2,2000);
		Builder builder3=new Builder("Precilla",5478,5,4500);
		Builder builder4=new Builder("Precilla",9632,6,9870);
		Builder builder5=new Builder("Precilla",4781,4,36500);
		
		List<Builder> list=new ArrayList<Builder>();
		list.add(builder1);
		list.add(builder2);
		list.add(builder3);
		list.add(builder4);
		list.add(builder5);
		System.out.println("Build information based on revenue ascending order: ");
		Collections.sort(list,new Builder(null, 0, 0, 0));
		System.out.println(list);
		System.out.println();
		System.out.println("Build information based on totalCompletedProject descending order: ");
		Collections.sort(list,Collections.reverseOrder(new Client()));
		System.out.println(list);
		
		
	}
	@Override
	public int compare(Builder b1,Builder b2) {
		return b1.totalCompletedProject-b2.totalCompletedProject;
	}

	

}
