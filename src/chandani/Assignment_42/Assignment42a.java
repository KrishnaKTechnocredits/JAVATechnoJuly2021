package chandani.Assignment_42;

/*Assignment - 42 : 29th Sep'2021 
Program 1: Remove multiple occurrence of characters from given string.

input : "technocredits"
output : technordis

Program 2: Remove all occurrence of duplicate character from given string.
input : "technocredits"
output : "hnordis" */

class Assignment42a{

	

	void removeMultipleOccurence(String str){
		String output = "";
		for(int index = 0; index < str.length(); index++){
			char ch = str.charAt(index);
			if (str.indexOf(ch) == index)
				output = output + ch;
			}
		System.out.println("The output after removing multiple occurences from the string " + str + " is " + output );
		}
	
	void removeDuplicateOccurence(String str) {
		String output1 = "";
		for(int index = 0; index < str.length(); index++){
			char ch = str.charAt(index);
			if (str.indexOf(ch) == str.lastIndexOf(ch))
				output1 = output1 + ch;
			}
		System.out.println("The output after removing duplicate occurences from the string " + str + " is " + output1);
	}
		
	public static void main (String[] args){
		Assignment42a assignment42a = new Assignment42a();
		String str = "technocredits";
		assignment42a.removeMultipleOccurence(str);
		assignment42a.removeDuplicateOccurence(str);
	}

}
