package rushikesh.assign40_45;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Program 2: print duplicates in arraylist [print all the elements having freq more than 1]
//input : ["Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
//output : ["Mayur","Chandni","Amruta"]


public class Assign45_2 {
	public static void main(String[] args) {
		Assign45_2 assign45_2=new Assign45_2();
		String[] input= {"Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"};
		assign45_2.getDuplicates(input);
	}
	void getDuplicates(String[] str) {
		List<String> list=Arrays.asList(str);
		ArrayList<String> name=new ArrayList<String>(list);
		System.out.println("input String"+name);
		ArrayList<String> output=new ArrayList<String>();
		
		for(int index=0;index<name.size();index++) {
			if(!(name.indexOf(name.get(index))==name.lastIndexOf(name.get(index)))) {
				if(index==name.indexOf(name.get(index))) 
					output.add(name.get(index));
			}
			
		}
		System.out.println(output);
		
		
	}
	
}
