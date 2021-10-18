package precilla.assignment48;

import java.util.HashMap;
//program 8 : find the word with second highest freq.
public class Program8 {
	void secondmax(String input) {
		int max=0;
		int secondmax=0;
		String secondmaxvalue="";
		String[] arr= input.split(" ");
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
			for(String data:arr) {
			if(hm.containsKey(data)) 
				hm.put(data, hm.get(data)+1);
			else
				hm.put(data, 1);
		
		}
			for(String word:hm.keySet()) {
				if(max<hm.get(word)) {
					secondmax=max;
					max=hm.get(word);
					secondmaxvalue=word;
				}
				else if(secondmax<max&&secondmax<hm.get(word)) {
					secondmax=hm.get(word);
					secondmaxvalue=word;
				}
			}
	
		System.out.println("Second maximum word and length \n"+secondmaxvalue+" : "+secondmax);
	}
	public static void main(String[] args) {
		String input="Hi Hello Hi Techno Credits Hi Credits";
		System.out.println("input : "+input);
		new Program8().secondmax(input);
	}

}
