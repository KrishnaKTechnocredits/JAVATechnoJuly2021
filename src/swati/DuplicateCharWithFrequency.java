package swati;
import java.util.*;
class DuplicateCharWithFrequency{
	
	int findFrequencyOfChar(String input,char ch){
		int count=0;
		for(int index=0;index<input.length();index++){
			if(input.charAt(index) == ch){
				count++;
			}
		}
		System.out.println("Frequency of char " +ch +" is: "+count);
		return count;
	}
	
	void printCharDuplicateCount(String input){
		for(int index=0;index<input.length();index++){
			if(input.indexOf(input.charAt(index))<input.lastIndexOf(input.charAt(index))){
				if(index==input.indexOf(input.charAt(index)))
				findFrequencyOfChar(input,input.charAt(index));
			}
		}
	}
	
	public static void main(String[] args){
		DuplicateCharWithFrequency duplicateChar=new DuplicateCharWithFrequency();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String :");
		String inputStr=scan.next();
		duplicateChar.printCharDuplicateCount(inputStr);
	}
}