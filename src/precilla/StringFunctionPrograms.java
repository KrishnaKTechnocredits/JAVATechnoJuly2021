package precilla;
import java.util.Scanner;

public class StringFunctionPrograms {
	int getNumberOfWords(String input) {
		String elements[]=input.split(" ");
		return elements.length;
	}
	String getMinimumWord(String input) {
		String elements[]=input.split(" ");
		int index=0;
		String minWord=elements[index];
		for(index=0;index<elements.length;index++) {
			if(minWord.length()>elements[index].length()) {
				minWord=elements[index];}
		}
		return minWord;
	}
	String getMaximumWord(String input) {
		String elements[]=input.split(" ");
		int index=0;
		String maxWord=elements[index];
		for(index=0;index<elements.length;index++) {
			if(maxWord.length()<elements[index].length()) {
				maxWord=elements[index];}
		}
		return maxWord;
	}
	int sumOfAllNumbers(String input) {
		String[] num= input.split(" ");
		int sum=0;
		for(int index=0;index<num.length;index++){
			sum=sum+Integer.parseInt(num[index]);
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringFunctionPrograms stringProgram= new StringFunctionPrograms();
		Scanner inputValue=new Scanner(System.in);
		System.out.println("Program 1 : Words in a given statement : ");
		System.out.print("Input =  ");
		String input=inputValue.nextLine();
		System.out.print("output : " +stringProgram.getNumberOfWords(input));
		System.out.println("\n\nProgram 2 : Maximum word length from given statement : ");
		System.out.print("Input = ");
		String input2=inputValue.nextLine();
		System.out.print("output : "+stringProgram.getMaximumWord(input2));
		System.out.println("\n\nProgram 3 : Minimum word length from given statement : ");
		System.out.print("Input = "+input2);
		System.out.println("\noutput : "+stringProgram.getMinimumWord(input2));
		System.out.println("\nProgram 4 : Enter the statement to get sum of all numebers: ");
		System.out.print("Input = ");
		String input1=inputValue.nextLine();
		System.out.print("Sum of all numbers in given statement  : "+stringProgram.sumOfAllNumbers(input1));
	}

}
