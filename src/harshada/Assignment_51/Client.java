package harshada.Assignment_51;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Client implements Comparator <BuilderComparatorDemo> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BuilderComparatorDemo obj1=new BuilderComparatorDemo("harshada", 1234, 25, 14000);
		BuilderComparatorDemo obj2=new BuilderComparatorDemo("harshada", 1000, 20, 10000);
		BuilderComparatorDemo obj3=new BuilderComparatorDemo("mandhare", 1200, 28, 140000);
		BuilderComparatorDemo obj4=new BuilderComparatorDemo("siddhi", 12345, 21, 20000);
	
		ArrayList<BuilderComparatorDemo> listOfBuilder=new ArrayList <BuilderComparatorDemo> ();
		
		listOfBuilder.add(obj1);
		listOfBuilder.add(obj2);
		listOfBuilder.add(obj3);
		listOfBuilder.add(obj4);
		
		Collections.sort(listOfBuilder, new BuilderTest());
		System.out.println(listOfBuilder);

		Collections.sort(listOfBuilder, new Client().reversed());
		System.out.println(listOfBuilder);

	}

	@Override
	public int compare(BuilderComparatorDemo o1, BuilderComparatorDemo o2) {
		// TODO Auto-generated method stub
		return o1.totalCompletedProjects-o2.totalCompletedProjects;
	}

}
