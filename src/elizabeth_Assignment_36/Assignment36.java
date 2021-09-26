package elizabeth_Assignment_36;

public class Assignment36 {
	
	String swapVowels(String input){
		String output="";
		String temp=" ";
		for(int index=0;index<input.length();index++){
			if(input.charAt(index)=='a' || input.charAt(index)=='e'|| input.charAt(index)=='i' || input.charAt(index)=='o' ||input.charAt(index)=='u'){
				temp+=input.charAt(index);
			}
		}
		int n=temp.length()-1;
		for(int index=0;index<input.length();index++){
			if(input.charAt(index)=='a' || input.charAt(index)=='e'|| input.charAt(index)=='i' || input.charAt(index)=='o' ||input.charAt(index)=='u'){
				output+=temp.charAt(n);
				n--;
			}else{
				output+=input.charAt(index);
			}
		}
		return output;
	}
	
	public static void main(String[] args){
		Assignment36 assignment36=new Assignment36();
		System.out.println(assignment36.swapVowels("good morning"));
		System.out.println(assignment36.swapVowels("eliza"));
	}
}
