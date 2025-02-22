package rushikesh.assign40_45;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//program 3: print index of all occurances of Akanksha.
//input : ["Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
//output : 1
//         4

public class Assign45_3 {
	public static void main(String[] args) {
		Assign45_3 assign45_3=new Assign45_3();
		String[] input= {"Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"};
		System.out.println("output:");
		assign45_3.getIndex(input,"Akanksha");
	}
	void getIndex(String[] str,String word) {
		List<String> list=Arrays.asList(str);
		ArrayList<String> al=new ArrayList<String>(list);
		for(int index=0;index<al.size();index++) {
			if(al.get(index).contains(word)) {
				System.out.println(index+" ");
			}
		}
		
		
		
		
		
		
		
		
		
	}
}
