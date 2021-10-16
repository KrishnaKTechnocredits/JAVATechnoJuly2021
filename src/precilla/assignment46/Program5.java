package precilla.assignment46;

import java.util.HashSet;
import java.util.Set;

//Remove the longest string from given Set.
public class Program5 {
	public static void main(String[] args) {
		Set<String> set=new HashSet<>();
		set.add("Hello");
		set.add("Good");
		set.add("Morning");
		set.add("Technocredits");
		set.add("students");
		int length=0;
		String max="";
		System.out.println("input : "+set);
		for(String data:set) {
			if(data.length()>length) {
				length=data.length();
				max=data;
			}
		}
		System.out.println("Output : "+max);
		
	}

}
