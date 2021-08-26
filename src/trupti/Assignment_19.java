package trupti;

public class Assignment_19 {
	
	int getTotalWordCount(String input) {
		String[] arr=input.split(" ");
		int wordCount=arr.length;
		return wordCount;
	}
	
	String getMaxWord(String input) {
		String[] arr=new String[input.length()];
		arr=input.split(" ");
		String  maxWord=arr[0];
		for(int index=1; index<arr.length; index++) {
			if (arr[index].length() > maxWord.length())
				maxWord=arr[index];
		}
		return maxWord;
	}
	
	String getMinWord(String input) {
		String[] arr=input.split(" ");
		String minWord=arr[0];
		for(int index=1;index<arr.length;index++) {
			if (arr[index].length() < minWord.length())
			minWord=arr[index];
		}
		return minWord;
	}
	
	int sumOfNumber(String str) {
		String[] arr=str.split(" ");
		int sum=0;
		for(int index=0; index<arr.length; index++) {
			sum += Integer.parseInt(arr[index]);
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		Assignment_19 assignment_19=new Assignment_19();
		String arr="hi techno credits hello all";
		System.out.println("Total word count: "+assignment_19.getTotalWordCount(arr));
		
		String arr1="good morning technocredits hi hello";
		System.out.println("Max word: "+assignment_19.getMaxWord(arr1));
		
		String arr2="good morning technocredits hi hello";
		System.out.println("min word: "+assignment_19.getMinWord(arr2));
		
		String arr3="10 30 50 12";
		System.out.println("sum is: "+assignment_19.sumOfNumber(arr3));
	}
	
}