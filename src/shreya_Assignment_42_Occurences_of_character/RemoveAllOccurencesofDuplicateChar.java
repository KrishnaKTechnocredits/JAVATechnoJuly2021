/*Assignment - 42 : 29th Sep'2021 
Program 2: Remove all occurrence of duplicate character from given string.
input : "technocredits"
output : "hnordis"*/
package shreya_Assignment_42_Occurences_of_character;

public class RemoveAllOccurencesofDuplicateChar {
	void getString() {
		String str="technocredits";
		String output="";
		for(int index=0;index<str.length();index++) {
			if(str.indexOf(str.charAt(index))==str.lastIndexOf(str.charAt(index))) {
				output+=str.charAt(index);
			}
		
		}
		System.out.println("String sfter removing all duplicate characters from string: "+output);	
	}
	public static void main(String[] args) {
		RemoveAllOccurencesofDuplicateChar str=new RemoveAllOccurencesofDuplicateChar();
		str.getString();

	}

}
