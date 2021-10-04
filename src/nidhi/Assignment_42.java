package nidhi;

/**Assignment - 42 : 29th Sep'2021 
Program 1: Remove multiple occurrence of characters from given string.

input : "technocredits"
output : technordis

Program 2: Remove all occurrence of duplicate character from given string.
input : "technocredits"
output : "hnordis
**/

class Assignment_42{
	
	String removeMultipleOccurence(String input){
		String output="";
		
		for(int index=0;index<input.length();index++){
			if (output.contains(input.charAt(index)+"")){
			}		
			else {
				output = output + input.charAt(index);
			}
			
		}
		return output;
	}
	
	String removeAllOccurence(String input){
		String output="";
		for(int index=0;index<input.length();index++){
			if (input.indexOf(input.charAt(index)) == input.lastIndexOf(input.charAt(index)))
				output = output + input.charAt(index);
		}
		return output;
	}
	
	public static void main(String[] arg){
		Assignment_42 assignment = new Assignment_42();
		String input = "technocredits";
		System.out.println(assignment.removeAllOccurence(input)); 
		System.out.println(assignment.removeMultipleOccurence(input));
	}

}