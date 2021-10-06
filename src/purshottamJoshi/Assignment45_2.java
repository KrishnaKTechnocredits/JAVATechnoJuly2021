package purshottamJoshi;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment45_2 {
	
public static void main(String[] args) {
		
		String[] str= {"Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"};
		ArrayList<String> al = new ArrayList<>(Arrays.asList(str));
		ArrayList<String> output = new ArrayList<>();
		int count=0;
		for(int index=0; index <al.size(); index++) {
			
			if(!(al.indexOf(al.get(index)) ==  al.lastIndexOf(al.get(index)))){
				if(al.indexOf(al.get(index)) == index) {
				output.add(al.get(index));
			
				}
			}
		}
		System.out.println(output);
		
	}

}
