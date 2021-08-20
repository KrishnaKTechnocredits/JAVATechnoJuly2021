/*Assignment - 19 : 20th Aug'2021

program 1: Find how many words in a given statement.
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
output : 70       */


package ritabrata;

public class Assignment19 {
	int wordCount(String input) {
		int count=0;
		for(int index=0; index<input.length(); index++) {
			char ch= input.charAt(index);
			if(ch == ' ')
				count++;
		}
		System.out.println("Total number of words: "+ ++count);
		return count;
	}
	
	String stringOfMaxLength(String input){
		String[] arr= input.split(" ");
		int max= 0;
		String maxStr= arr[0];
		for(int index=0; index<arr.length; index++) {
				if(max<arr[index].length()) {
					max=arr[index].length();
					maxStr=arr[index];
				}
			
		}
		System.out.println("The word with maximum no of letters is: "+maxStr);
		return maxStr;
	}
	
	String stringOfMinLength(String input){
		String[] arr= input.split(" ");
		int min= arr[0].length();
		String minStr= arr[0];
		for(int index=0; index<arr.length; index++) {
			
				if(arr[index].length()<min)
					minStr= arr[index];
		}
			
		
		System.out.println("The word with minimum no of letters is: "+minStr);
		return minStr;
	}
	
	int sumNumbers(String input) {
		String[] arr= input.split(" ");
		int sum=0;
		for(int index=0; index<arr.length; index++) {
			int num= Integer.parseInt(arr[index]);
			sum=sum+num;
		}
		System.out.println("The sum of all integers is: "+ sum);
		return sum;
	}

	public static void main(String[] args) {
		Assignment19 assignment19= new Assignment19();
		assignment19.wordCount("Hi Techno Credits Hello");
		assignment19.stringOfMaxLength("good morning technocredits hi hello");
		assignment19.stringOfMinLength("good morning technocredits hi hello");
		assignment19.sumNumbers("10 10 20 30");

	}

}
