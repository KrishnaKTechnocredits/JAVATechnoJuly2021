/*Create a client class.
-> create 5 objects of builder class by passing values to constructor.
-> Create a list, add all builder objects and sort it.
-> override toString method to print builder name, revenue.

Exception : while sort the arrayList based on revenue, it should print build information based on revenue ascending order. 
while sort the arrayList based on totalCompletedProject, it should print build information based decending order of
 totalCompletedProject.*/

package elizabeth_Assignment_51;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {
	
	public static void main(String[] args) {
		Builder builder1=new Builder("eliza",1234,3,7809);
		Builder builder2=new Builder("mary",1235,6,7803);
		Builder builder3=new Builder("lizzie",1232,9,7805);
		Builder builder4=new Builder("marc",1221,5,7806);
		Builder builder5=new Builder("james",1267,2,7801);
			
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
		Collections.sort(list,Collections.reverseOrder(new Test()));
		System.out.println(list);
		
	}

}
