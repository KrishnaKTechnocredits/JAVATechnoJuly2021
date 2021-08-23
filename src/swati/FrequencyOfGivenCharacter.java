package swati;
import java.util.*;
class FrequencyOfGivenCharacter{
	
	int findFrequencyOfChar(String input,char ch){
		int count=0;
		for(int index=0;index<input.length();index++){
			if(input.charAt(index)==ch){
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] a){
		FrequencyOfGivenCharacter findreq=new FrequencyOfGivenCharacter();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String :");
		String inputStr=scan.next();
		System.out.println("Enter Character :");
		char ch=scan.next().charAt(0);
		int output=findreq.findFrequencyOfChar(inputStr,ch);
		System.out.println("Output :"+output);
	}
}
			