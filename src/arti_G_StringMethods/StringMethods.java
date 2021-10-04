package arti_G_StringMethods;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {

		//charAt method || char charAt(int index)
		String str = "TechnoCredits";
		for (int index = 0; index < str.length(); index++)
			System.out.println(str.charAt(index));
		
		//valueof() method >print the content of string || it takes anythings
		String str1 = "TechnoCredits";
		String s1= str.valueOf(str1);
		System.out.println(s1);
		
		//equals method compare the content || boolean equals(String str)
		//equalIgnorecase >it ignores the case but check similar content ||  boolean equalIgnoreCase(String str)
		String str2 = "TechnoCredits";
		String str3 = "TechnoCredits";
		String str4 = "Credits";
		String str5 = "credits";
		System.out.println(str2.equals(str3)); //true
		System.out.println(str2.equals(4)); //false
		System.out.println(str4.equalsIgnoreCase(str5)); //true
		System.out.println(str2.equalsIgnoreCase(str4)); //false
		
		//indexOf() method || int indexOf(char ch) >it checks first unique value
		//LastindexOf() method || int lastindexOf(char ch) >it checks last unique value
		String str6 = "TechnoCredits";
		int t2 = str6.indexOf('n');
		int t3 = str6.lastIndexOf('e');
		System.out.println(t2 + " "+ t3);
	
	// lower case & upper case method
		String str7 = "TechnoCredits";
		String t = str7.toLowerCase();
		String t1 = str7.toUpperCase();
		System.out.println("Lower case string "+ t + " and " + "Upper case string " + t1);
		
		//replace method & replace all
		String str8 = "Techno  Credits";
		String ss =  str8.replace('e', 'a');
		System.out.println(ss);
		
		
		
		//substring method
		String str9 = "TechnoCredits"; 
		System.out.println(str9.substring(str9.indexOf('h'))); // hnoCredits
		System.out.println(str9.substring(str9.indexOf('C'), str9.lastIndexOf('t'))); //Credi
		System.out.println(str9.substring(str9.indexOf('C'), str9.lastIndexOf('t')+1)); //Credit
		
		//Contains method
		String str10 = "TechnoCredits"; 
		System.out.println(str10.contains(str8));
	
		//toString method
		int a[] = {2,4,6,7,8};
		System.out.println(Arrays.toString(a));
	
		}		
}		
	
	


