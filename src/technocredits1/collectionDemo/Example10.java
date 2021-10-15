package technocredits1.collectionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example10 {

	public static void main(String[] args) {
		String[] arr = {"Maulik", "Techno"};
		List<String> list = Arrays.asList(arr);
		//list.remove(list.size()-1);
		
		List<String> li = new ArrayList<>(list);
		li.remove("Techno");
		System.out.println(li);
	}
}
