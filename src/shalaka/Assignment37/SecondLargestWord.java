/*Assignment - 37 : 23th Sep'2021
WAP to find a second largest word.

Example:
Input: Welcome to the family
Output: family*/
package shalaka.Assignment37;

public class SecondLargestWord {
	void  getSecondLargestWord(String input) {
		String maxWord="",secMaxWord="";
		int maxWordLen=0,secMaxLen=0;
		String arr[]=input.split(" ");
		
		for(int index=0;index<arr.length;index++) {
			 if(arr[index].length()>maxWordLen) {
				 maxWordLen=arr[index].length();
				maxWord=arr[index];
			 }
			 else if(arr[index].length()>secMaxLen) {
				 secMaxLen=arr[index].length();
				 secMaxWord=arr[index];
			 }
		}
		System.out.println("Second largest word is: "+secMaxWord);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="Welcome to the family";
		SecondLargestWord secondLargestWord = new SecondLargestWord();
		secondLargestWord.getSecondLargestWord(input);
	}

}
