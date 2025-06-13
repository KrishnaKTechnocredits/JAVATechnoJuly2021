package rushikesh.assign40_45;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//program 4 : return an ArrayList which contains name starts with A and having length more than 6 chars.
//input : ["Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta", "AparnaTiwari"]		 
//output : [Akanksha, AparnaTiwari]

public class Assign45_4 {
	public static void main(String[] args) {
		Assign45_4 assign45_3=new Assign45_4();
		String[] input= {"Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta", "AparnaTiwari"};
		System.out.println(assign45_3.getArrayList(input,"A", 6));
	}
	ArrayList<String> getArrayList(String[] ip,String ch,int length){
		List<String> list = Arrays.asList(ip);
		ArrayList<String> input = new ArrayList<String>(list);
		ArrayList<String> output = new ArrayList<String>();
		for(String name :input)
		{
			if(name.startsWith(ch)&& name.length()>length)
			{
				if(!(output.contains(name)))
				{
					output.add(name);
				}
			}
		}
		
		return output;
		
	}
}
