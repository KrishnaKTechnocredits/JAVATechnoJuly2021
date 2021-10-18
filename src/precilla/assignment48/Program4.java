package precilla.assignment48;
//program 4: print all duplicate words with their freq.
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class Program4 {
	void duplicate(String input) {
		String[] arr= input.split(" ");
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
			for(String data:arr) {
			if(hm.containsKey(data)) 
				hm.put(data, hm.get(data)+1);
			else
				hm.put(data, 1);
		
		}
		Set<Entry<String,Integer>> set=hm.entrySet();
		Iterator<Entry<String,Integer>> itr=set.iterator();
		while(itr.hasNext()) {
			Entry<String,Integer> entry=itr.next();
			if(entry.getValue()>1)
				System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}
	public static void main(String[] args) {
		String input="Hi Hello Hi Techno Credits Credits Hi Credits";
		new Program4().duplicate(input);
	}

}
