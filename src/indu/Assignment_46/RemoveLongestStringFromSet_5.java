/*Example 5 :
Remove the longest string from given Set.
*/
package indu.Assignment_46;

import java.util.HashSet;

public class RemoveLongestStringFromSet_5 {
	
	HashSet<String> removingLongestString()
	{
		HashSet<String> hashStr = new HashSet<>();
		HashSet<String> output = new HashSet<>();
		hashStr.add("Indu");
		hashStr.add("Tejal");
		hashStr.add("Nikita");
		hashStr.add("Aakanksha");
		hashStr.add("Kriyansh");
		hashStr.add("This is the future");
		String max="";
		for(String str : hashStr)
		{
			if(str.length()>max.length())
			{
				max= str;
			}
		}
		System.out.println("Set of String : "+hashStr);
		System.out.println("\nLongest String is : "+max);
		hashStr.remove(max);
		
		
		return hashStr;
	}
	
	public static void main(String[] args) {
		RemoveLongestStringFromSet_5 a46_5 =new RemoveLongestStringFromSet_5 ();
		System.out.println("\nAfter Removing Longest string :"+a46_5.removingLongestString());
	}
}
