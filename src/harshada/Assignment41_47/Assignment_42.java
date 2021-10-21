/*Assignment - 42 : 29th Sep'2021 
Program 1: Remove multiple occurrence of characters from given string.
input : "technocredits"
output : technordis
Program 2: Remove all occurrence of duplicate character from given string.
input : "technocredits"
output : "hnordis"*/


package harshada.Assignment41_47;

public class Assignment_42 {
	
	void p1_RemoveOccuranceOfCharacterFromString(String str1) {
		
		System.out.println("Program 1: Remove multiple occurrence of characters from given string.");
		System.out.println("Approch Uses Contains ( ) : ");	
		String str2=str1;
		char ch=' ';
		String output=" ";
		//input : "technocredits"
		//output : technordis
		for (int index = 0; index < str1.length(); index++) {
			//System.out.println(str1.valueOf(str1.charAt(index)));
			if (!output.contains(str1.valueOf(str1.charAt(index)))) //if output string already contains r have that character then dont add it to output str
				output =output+ str1.charAt(index);
		}
		
		System.out.println("String after removing repeated characters are : "+ output);
		
	}
	
	void p2_removeAllDuplicateCharacters(String str2) {
		
		System.out.println("Program 2: Remove all occurrence of duplicate character from given string.");
		System.out.println("Approch Uses indexof and lastindexOf( ) : ");	
		char temp=' ';
		String output1=" ";
		for(int j=0; j< str2.length(); j++) {
			temp=str2.charAt(j);
			if(str2.indexOf(temp)==str2.lastIndexOf(temp)) {
				output1=output1+temp;
			}
			
		}
		System.out.println("String after removing all duplicate characters are : "+ output1);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_42 assignment_42=new Assignment_42();
		String str="technocredits"; //output : technordis
		assignment_42.p1_RemoveOccuranceOfCharacterFromString(str);
		System.out.println("*****************");
		assignment_42.p2_removeAllDuplicateCharacters(str);
		
	}

}
