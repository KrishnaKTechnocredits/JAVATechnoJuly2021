/*Example 5 :
Remove the longest string from given Set.*/
package purshottamJoshi;
import java.util.*;

public class Assignment46_5 {
	
	public static void main(String[] args) {
		Set set = new LinkedHashSet();
		set.add("Purushottam");
		set.add("Pravin");
		set.add("Sumit");
		set.add("Suraj");
		Set set2 = new LinkedHashSet();
		String output="";
		
		Iterator<String> itr = set.iterator();
		
		while(itr.hasNext()) {
		
			String name =itr.next();
			if(name.length() > output.length()) {
				output = name;
							
			}
			if(!name.equals(output)) {
				set2.add(name);
				
			}
		}
		System.out.println(set2);
	}
}
	
