package avinash.assignment37;


/*WAP to find a second largest word.
Input: Welcome to the family
Output: family*/

public class Assignment_37 {
	String getSecondLargestWord(String input) {
		String secLargestword="", word="";
		int temp = 0;
		String arr[] = input.split(" ");
		for(int index=0; index<arr.length;index++) {
			if(word.length()<arr[index].length()) {
				word = arr[index];
				temp = index;
			}
		}
		
		arr[temp]="";
		for(int index=0;index<arr.length;index++) {
			if(secLargestword.length()<arr[index].length()) {
				secLargestword = arr[index];
			}
		}
		return secLargestword;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_37 assignment_37 = new Assignment_37();
		String str = "Welcome to the family";
		System.out.println("Input String: " + str);
		System.out.println("Second Largest Word: " + assignment_37.getSecondLargestWord(str));

	}

}
