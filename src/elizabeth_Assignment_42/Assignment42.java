/*Assignment - 42 : 29th Sep'2021 
Program 1: Remove multiple occurrence of characters from given string.

input : "technocredits"
output : technordis

Program 2: Remove all occurrence of duplicate character from given string.
input : "technocredits"
output : "hnordis"*/

package elizabeth_Assignment_42;
class Assignment42{
	
	
	String removeMultipleOccurence(String str){
		String output= " ";
		char ch=' ';
		for(int index=0;index<str.length();index++){//technocredits
			ch=str.charAt(index);
			if(index==str.indexOf(ch)){
				output+=ch;
			}
		}
		return output;
	}
	
	String removeDuplicates(String str){
		String output= " ";
		char ch=' ';
		for(int index=0;index<str.length();index++){
			ch=str.charAt(index);
			if(str.indexOf(ch)==str.lastIndexOf(ch))
				output+=ch;
		}
		return output;
	}
		
	
	public static void main(String[] args){
		Assignment42 assignment42=new Assignment42();
		System.out.println("Removing multiple occurrence of characters from given string: " +assignment42.removeMultipleOccurence("technocredits"));
		System.out.println("Removing all occurrence of duplicate character from given string: " +assignment42.removeDuplicates("technocredits"));
	}
}