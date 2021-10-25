package rushikesh.assign40_45;
  
//Assignment - 42 : 29th Sep'2021 
//Program 1: Remove multiple occurrence of characters from given string.
//
//input : "technocredits"
//output : technordis
//
//Program 2: Remove all occurrence of duplicate character from given string.
//input : "technocredits"
//output : "hnordis"

public class Assign42_2 {
	
	public static void main(String[] args) {
		Assign42_2 assign42_2 = new Assign42_2();
		String input = "technocredits";
		assign42_2.removeDuplicates(input);
	}

	void removeDuplicates(String input) {
		String s1="";
		for(int index=0; index<input.length();index++) {
			char ch=input.charAt(index);
			
			if(input.indexOf(ch)!=input.lastIndexOf(ch)) {
				
			}else
				s1+=ch;
		}
		System.out.println(s1);
	}
	
	
	
	
	
	
	

}
