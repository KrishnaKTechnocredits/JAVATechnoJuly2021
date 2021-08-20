/*program 1: Find how many words in a given statement.
input = "Hi Techno Credits Hello"
output : 4

program 2: Find maximum word length from given statement.
input = "good morning technocredits hi hello";
output : technocredits

program 3 : Find minimum word length from given statement.
input = "good morning technocredits hi hello";
output : hi

program 4: sum of all numbers in given statement.
input = "10 10 20 30";
output : 70*/
package elizabeth;
import java.util.Scanner;

class Assignment19{
	
	int getWordCount(String str){
		
		String[] input= new String[str.length()];
		input=str.split(" ");
		int output=input.length;
		return output;
	}
	
	String maxWordLength(String str1){
		int max=0;
		String output="";
		String[] input= new String[str1.length()];
		input=str1.split(" ");
		for(int index=0;index<=input.length-1;index++){
			if(max<input[index].length()){
				max=input[index].length();
				output=input[index];
			}
		}
		return output;
	}
	
	String minWordLength(String str2){
		String output="";
		String[] input= new String[str2.length()];
		input=str2.split(" ");
		int min=input[0].length();
		for(int index=0;index<=input.length-1;index++){
			if(min>input[index].length()){
				min=input[index].length();
				output=input[index];
			}
		}
		return output;
	}
	
	int sumOfNumbers(String str3){
		int sum=0;
		String[] arr=new String[str3.length()];
		arr=str3.split(" ");
		int input[]=new int[arr.length];
		for(int index=0;index<=input.length-1;index++){
			input[index]=Integer.parseInt(arr[index]);
			sum=sum+input[index];
		}
		return sum;
	}
	
	public static void main(String[] args){
		Assignment19 assignment19=new Assignment19();
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("*****Count of Words*****");
		System.out.println("Enter the String: ");
		String str=scanner.nextLine();
		System.out.println("Count of words: ");
		System.out.println(assignment19.getWordCount(str));
	
		System.out.println("*****Maximum length word*****");
		System.out.println("Enter the String: ");
		String str1=scanner.nextLine();
		System.out.println("Maximum length word from given statement: ");
		System.out.println(assignment19.maxWordLength(str1));
		
		System.out.println("*****Minimum length word*****");
		System.out.println("Enter the String: ");
		String str2=scanner.nextLine();
		System.out.println("Minimum length word from given statement: ");
		System.out.println(assignment19.minWordLength(str2));
		
		System.out.println("*****Sum Of Numbers*****");
		System.out.println("Enter the String: ");
		String str3=scanner.nextLine();
		System.out.println("Sum of all numbers in given statement: ");
		System.out.println(assignment19.sumOfNumbers(str3));
		
	}
}