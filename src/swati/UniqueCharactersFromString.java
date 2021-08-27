package swati;
import java.util.*;
class UniqueCharactersFromString{
	
	void printUnique(String input){
		for(int index=0;index<input.length();index++){
			if(input.indexOf(input.charAt(index))==input.lastIndexOf(input.charAt(index)))
				System.out.println(input.charAt(index));
			
		}
	}
	
	public static void main(String[] args){
		UniqueCharactersFromString uniqueChar=new UniqueCharactersFromString();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String :");
		String inputStr=scan.next();
		uniqueChar.printUnique(inputStr);
	}
}