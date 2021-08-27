package swati;
import java.util.*;
class CountWordInGivenStatement{
	
	void printCountWords(String input){
		String[] splitArrayValue=input.split(" ");
		System.out.println("Number of words in statement :"+ splitArrayValue.length);
	}
	
	public static void main(String[] a){
		CountWordInGivenStatement countWord=new CountWordInGivenStatement();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the statement :");
		String inputString=scanner.nextLine();
		countWord.printCountWords(inputString);
		scanner.close();
	}
}
			
