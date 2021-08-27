package nidhi;

class Assignment_19{
	
	String input = "good morning technocredits hi hello";
	String input1 = "10 10 20 30";
	
	int countNumberOfWords(String input){
		String output[]= input.split(" ");
		int inputSize = output.length;
		for (int i=0;i<output.length;i++){
		
		}
		return inputSize;
	}
	
	String maxWordLength(String input){
		
		String output[]= input.split(" ");
		String maxLen = ""; 
		for (int i=0;i<output.length;i++){
			if (maxLen.length() < output[i].length())
				maxLen = output[i];
		}
		return maxLen;
	}
	
	String minWordLength(String input){
		String output[]= input.split(" ");
		String minLen = input; 
		for (int i=0;i<output.length;i++){
			if (minLen.length() > output[i].length())
				minLen = output[i];
		}
		return minLen;
	}
	
	int addNumbersOfStatement(String input){
		int sum=0;
		String output[]= input.split(" ");
		for (int i=0;i<output.length;i++){
				sum = sum + Integer.parseInt(output[i]);
		}
		return sum;
	}
	
	public static void main(String[] arg){
		Assignment_19 assignment19 = new Assignment_19();
		System.out.println("Total no. of words in given String : " + assignment19.countNumberOfWords(assignment19.input));
		System.out.println("Max length word is : " + assignment19.maxWordLength(assignment19.input));
		System.out.println("Min length word is : " + assignment19.minWordLength(assignment19.input));
		System.out.println("Sum of all numbers in given string : " + assignment19.addNumbersOfStatement(assignment19.input1));
		
	}
}
