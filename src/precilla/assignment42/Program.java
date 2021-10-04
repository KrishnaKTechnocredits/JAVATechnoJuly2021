package precilla.assignment42;



public class Program {
	String removeMuliple(String str) {
		String output="";
		int count=0;
		for(int index=0;index<str.length();index++) {
			if(index==str.indexOf(str.charAt(index))) 
				count++;
			if(count==1) {
				output+=str.charAt(index);
			}
			count=0;
		}
		return output;
	}
	String removeDuplicate(String str) {
		String output="";
		int count=0;
		for(int index=0;index<str.length();index++) {
			if(str.indexOf(str.charAt(index))==str.lastIndexOf(str.charAt(index))) 
				count++;
			if(count==1) {
				output+=str.charAt(index);	
			}
			count=0;
		}
		return output;
	}
	public static void main(String[] args) {
		System.out.println("Program 1: Remove multiple occurrence of characters from given string.");
		Program p=new Program();
		String str="technocredits";
		System.out.println("input :" +str);
		System.out.println("output :" +p.removeMuliple(str));
		
		System.out.println("\nProgram 2: Remove all occurrence of duplicate character from given string.");
		String str1="technocredits";
		System.out.println("input :" +str1);
		System.out.println("output :" +p.removeDuplicate(str1));
	}

}
