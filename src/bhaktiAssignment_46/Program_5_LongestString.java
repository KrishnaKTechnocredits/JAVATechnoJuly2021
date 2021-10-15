package bhaktiAssignment_46;

import java.util.ArrayList;
import java.util.Arrays;

public class Program_5_LongestString {
	
	static void removeLongestString(ArrayList<String> input) {
		String str="";
		int max=0;
		for (String s: input) {
			if(max< s.length() ) {
				max=s.length();
				str=s;
			}	
		}
		input.remove(str);
		System.out.println(input);
	}
	
	public static void main(String[] args) {
		String[] str1= {"Bhakti","Harshadashinde", "Amol", "Amruta" ,"Harshada", "Amol"};
		ArrayList al2=new ArrayList(Arrays.asList(str1));
		removeLongestString(al2);
	}

}
