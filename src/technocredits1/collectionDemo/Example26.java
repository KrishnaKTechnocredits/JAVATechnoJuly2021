package technocredits1.collectionDemo;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Example26 {

	public static void main(String[] args) {
		LinkedHashSet<String> hs = new LinkedHashSet<String>();
		hs.add("Purushottam");
		hs.add("Shraddha");
		hs.add("Margi");
		hs.add("Aniket");
		hs.add("Shah");
		hs.add("Shantanu");
		
		Iterator<String> itr = hs.iterator();
		while(itr.next() != null)
			System.out.println(itr.next());
	}
}
