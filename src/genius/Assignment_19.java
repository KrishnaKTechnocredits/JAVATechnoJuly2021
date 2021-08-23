package genius;

public class Assignment_19 {
     
	int getWordsInGivenStatement(String input) {
	   String[] arr = input.split(" ");
	   return arr.length;
	}
	
	String getMaxlengthString(String input1) {
		String maxLength = "";
		String arr[] = input1.split(" ");
		for(int index=0; index<arr.length; index++) {
			if(arr[index].length() > maxLength.length())
				maxLength = arr[index];
		}
		return maxLength;
	}
	
	String getMinlengthString(String input1) {
		String minLength = input1;
		String arr[] = input1.split(" ");
		for(int index=0; index<arr.length; index++) {
			if(arr[index].length() < minLength.length())
				minLength = arr[index];
		}
		return minLength;
	}
	
	int getsumOfAllNum(String input2) {
		String[] arr = input2.split(" ");
		int sum = 0;
		for(int index=0;index<arr.length;index++) {
			sum = sum + Integer.parseInt(arr[index]);
		}
		
		return sum;
	}
	public static void main(String[] args) {
		String input = "Hi Techno Credits Hello";
		Assignment_19 assignment_19 = new Assignment_19();
		int count = assignment_19.getWordsInGivenStatement(input);
		System.out.println("Words count in given statement is : "+count);
		String input1 = "good morning TechnoCredits hi Hello";
		System.out.println("Maximum length string is : "+assignment_19.getMaxlengthString(input1));
		System.out.println("Minimum length string is : "+assignment_19.getMinlengthString(input1));
		String input2 = "10 10 20 30";
		System.out.println("Sum of given numbers are : "+assignment_19.getsumOfAllNum(input2));
		
	}

}
