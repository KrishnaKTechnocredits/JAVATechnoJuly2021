package swati;
import java.util.*;
class FindMinimumWordLength{
	
	void  printMinimumWord(String input){
	String[] inputStrArray=input.split(" ");
	int min=inputStrArray[0].length();
	String output="";
	for(int index=1;index<inputStrArray.length;index++){
		if(inputStrArray[index].length()<min){
			output=inputStrArray[index];
			min=output.length();
		}
	}
	System.out.println("\nOutput: "+output);
	}
	
	public static void main(String[] a){
		FindMinimumWordLength findMin=new FindMinimumWordLength();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the statement :");
		String input=scanner.nextLine();
		findMin.printMinimumWord(input);
		scanner.close();
	}
}
	