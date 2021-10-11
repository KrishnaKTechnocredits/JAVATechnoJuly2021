package technocredits1.collectionDemo;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Example27 {

	public static void main(String[] args) {
		LinkedHashSet<String> hs = new LinkedHashSet<String>();
		hs.add("Purushottam");
		hs.add("Shraddha");
		hs.add("Margi");
		hs.add("Aniket");
		hs.add("Shah");
		hs.add("Shantanu");
		hs.add("Shah1");
		
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext()) {
			if(itr.next() != null)
				System.out.println(itr.next());
		}
	}
}
