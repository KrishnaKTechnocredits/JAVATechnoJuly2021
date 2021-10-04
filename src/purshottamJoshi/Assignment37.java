/*
Assignment - 37 : 23th Sep'2021
WAP to find a second largest word.

Example:
Input: Welcome to the family
Output: family*/
package purshottamJoshi;

class Assignment37{

	void secondLargestWord(String input) {
		String[] output = input.split(" ");
		String outputString1 = ""; 
		String outputString2 = "";
		for (int index = 0; index < output.length; index++) {
			if (output[index].length() > outputString1.length()) {
				outputString2 = outputString1;
				outputString1 = output[index];
			} else if (output[index].length() > outputString2.length())
				outputString2 = output[index];
		}
		System.out.println("Second Largest Word in String is : "+outputString2);
	}
	
	public static void main(String[] args){
		String str = "Welcome to the family";
		new Assignment37().secondLargestWord(str);
		
	}
}