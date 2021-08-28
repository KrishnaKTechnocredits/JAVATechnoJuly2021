package swati;
import java.util.*;
class FrequencyOfEachCharacter{
	
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
	
	void printCharWithFrequency(String input){
		for(int index=0;index<input.length();index++){
			if(index == input.indexOf(input.charAt(index))){
			findFrequencyOfChar(input,input.charAt(index));
			}
		}
	}

	public static void main(String[] args){
		FrequencyOfEachCharacter findreq=new FrequencyOfEachCharacter();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String :");
		String inputStr=scan.next();
		findreq.printCharWithFrequency(inputStr);
	}
}