/*Assignment - 42 : 29th Sep'2021 
Program 1: Remove multiple occurrence of characters from given string.

input : "technocredits"
output : technordis*/
package shreya_Assignment_42_Occurences_of_character;

public class RemoveMultipleOccurencesofChar {
	void getchar() {
		String str="technocredits";
		String output="";
		
		for(int index=0;index<str.length();index++) {
			if(!output.contains(str.valueOf(str.charAt(index)))){
				output+=str.charAt(index);
			}
		}
		System.out.println("String after removing multiple occurences of character: "+output);
		
	}
	public static void main(String[] args) {
		RemoveMultipleOccurencesofChar str=new RemoveMultipleOccurencesofChar();
		str.getchar();

	}

}
