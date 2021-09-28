//Assignment - 37 : 23th Sep'2021
//WAP to find a second largest word.
//
//Example:
//Input: Welcome to the family
//Output: family

package mayur.secondLargestNumberAssignment_37;

public class Assignment_37 {
	
	String secondLargestWord(String input) {
		String maxWord ="";
		String secondMax="";
		String[] output = input.split(" ");
		
		for(int index=0;index<output.length;index++) {
			if(output[index].length()>maxWord.length()) {
				secondMax = maxWord;
				maxWord =output[index];
			}else if (output[index].length()>secondMax.length());
				secondMax = output[index];
			}
		return secondMax;
	}
	
	public static void main(String[] args) {
		Assignment_37 assignment_37 = new Assignment_37();
		String str = "Welcome to the family";
		System.out.println("Second largest word from " +str+ " is : " +assignment_37.secondLargestWord(str));
	}
	}
