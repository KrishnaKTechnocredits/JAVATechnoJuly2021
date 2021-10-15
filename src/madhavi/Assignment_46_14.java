package madhavi;

import java.util.*;
// Write a program to traverse (or iterate) ArrayList using enhanced for loop and iterator.
public class Assignment_46_14 {

	public static void main(String[] args) {
		ArrayList<String> socialMediaArr = new ArrayList<String>(Arrays.asList("Facebook", "Twitter", "Snapchat", "Instagram"));
	
		Iterator<String> itr = socialMediaArr.iterator();
		System.out.println("PRINT ARRAY USING ITERATOR");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		System.out.println("***********************");
		
		System.out.println("PRINT ARRAY USING EHANCED FOR LOOP");
		
		for(String str : socialMediaArr)
		{
			System.out.println(str);
		}

	}

}
