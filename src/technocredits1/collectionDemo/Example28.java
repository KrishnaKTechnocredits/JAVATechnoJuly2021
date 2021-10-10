package technocredits1.collectionDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class Example28 {

	public static void main(String[] args) {
		ArrayList<String> arrayListOfNames = new ArrayList<String>();
		arrayListOfNames.add("Purushottam");
		arrayListOfNames.add("Shraddha");
		arrayListOfNames.add("Margi");
		arrayListOfNames.add("Aniket");
		arrayListOfNames.add("Shah");
		arrayListOfNames.add("Shantanu");
		arrayListOfNames.add("Shah1");
		
		Iterator<String> itr = arrayListOfNames.iterator();
		while(itr.hasNext()) {
				String name = itr.next();
				if(name.startsWith("S") && name.length() > 5)
					itr.remove();
		}
		System.out.println(arrayListOfNames);
	}
}
