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

public class Assign42_1 {
	
	public static void main(String[] args) {
		Assign42_1 assign42_1 = new Assign42_1();
		String input = "technocredits";
		assign42_1.removeOccurence(input);
	}

	void removeOccurence(String input) {
		String s1="";
		for(int index=0;index<input.length();index++) {
			char ch= input.charAt(index);
			if(input.indexOf(ch)!=input.lastIndexOf(ch)) {
				if(!s1.contains(Character.toString(ch))) {
					s1+=ch;
				}
			}else
				s1+=ch;
		}
		System.out.println(s1);
	}
	
	
	
	
	
	
	
	

}
