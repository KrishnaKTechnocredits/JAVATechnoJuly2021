package swati;
import java.util.*;

class FindMaximumWordLength{
	
	void  printMaximumWord(String input){
	String[] inputStrArray=input.split(" ");
	int max=0;
	String output="";
	for(int index=0;index<inputStrArray.length;index++){
		if(inputStrArray[index].length()>max){
			output=inputStrArray[index];
			max=output.length();
		}
	}
	System.out.println("\nOutput: "+output);
	}
	
	public static void main(String[] a){
		FindMaximumWordLength findMax=new FindMaximumWordLength();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the statement :");
		String input=scanner.nextLine();
		findMax.printMaximumWord(input);
		scanner.close();
	}
}