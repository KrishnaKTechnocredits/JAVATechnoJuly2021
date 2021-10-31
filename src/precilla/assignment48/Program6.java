package precilla.assignment48;
//program 6: find the freq of each word in a given statement.
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Program6 {
	void frequencyString(String input) {
		String[] arr= input.split(" ");
		HashMap<String,Integer> hm=new LinkedHashMap<String,Integer>();
			for(String data:arr) {
				if(hm.containsKey(data)) 
					hm.put(data, hm.get(data)+1);
				else
					hm.put(data, 1);
		
		}
		System.out.println(hm);
	}
	public static void main(String[] args) {
		String input="Hi Hello Hi Techno Credits Credits Hi Credits";
		new Program6().frequencyString(input);
	}
	
}
