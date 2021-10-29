package ashit_assignment_37;

public class Assingment_37 {
	void findSecondLargestWord(String line) {
		String str= line;
		String[] input= str.split(" ");
		String str1= ""; String str2="";
		for(int index=0; index<input.length;index++) {
			str1 = input[index];
			for(int index1=0; index1<input.length;index1++) 
			if (str1.length()<input[index1].length()) {
				str2=str1;
				str1=input[index1];

			}
		}
		System.out.println("Given string is: " + line);
		System.out.println("second largest word in the given string is :"+str2);

	}

	public static void main(String [] a) {
		Assingment_37 assingment_37 = new Assingment_37();
		String input= "Welcome to the family";
		assingment_37.findSecondLargestWord(input);
		String input1= "Good morning India";
		assingment_37.findSecondLargestWord(input1);
	}

}
/*WAP to find a second largest word.
Example:
Input: Welcome to the family
Output: family*/