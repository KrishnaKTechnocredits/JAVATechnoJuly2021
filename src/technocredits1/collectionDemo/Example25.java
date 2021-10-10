package technocredits1.collectionDemo;

import java.util.HashSet;
import java.util.Iterator;

public class Example25 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Purushottam");
		hs.add("Shraddha");
		hs.add("Margi");
		hs.add("Aniket");
		hs.add("Shah");
		hs.add("Shantanu");
		
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext())
			System.out.println(itr.next().length());
	}
}
