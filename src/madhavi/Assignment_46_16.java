package madhavi;

import java.util.*;
// Write a program to traverse(or iterate) HashSet.
public class Assignment_46_16 {

	public static void main(String[] args) {
		HashSet<Character> sampleHS = new HashSet<Character>(Arrays.asList('I', 'N', 'D', 'I'));
	
		Iterator<Character> itr = sampleHS.iterator();
		System.out.println("PRINT ARRAY USING ITERATOR");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}


	}

}