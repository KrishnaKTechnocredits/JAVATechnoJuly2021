package akanksha_K;

public class Assignment15 {

	int getEvenOddLengthDiff(String[] arr) {
		int evencount = 0;
		int oddcount =0;
		for (int index =0; index <arr.length; index++) {
			String word = arr[index];
			int wordlength = word.length();
			if(wordlength%2==0) {
				evencount += wordlength;
			}
			else
				oddcount += wordlength;
		}
		if ( evencount> oddcount)
			return evencount - oddcount;
		else
			return oddcount - evencount;
	}
	
	int middleChar;
	void getmidChar(String[] input) {
		for (int index= 0; index<input.length; index++) {
			char[] output = new char[3];
			if(input[index].length()%2==0) {
				middleChar = input[index].length()/2-1;
				output[index] =input[index].charAt(middleChar);
				System.out.println(output);
			}
			else {
				middleChar = input[index].length()/2;
				output[index]=input[index].charAt(middleChar);
				System.out.println(output);
				
			}
		}
	}
	
	int getEvenOddDiff(int[] input){
		int evensum = 0;
		int oddsum = 0;
		for (int index= 0; index<input.length; index++) {
			if(input[index]%2 == 0)
				evensum = evensum + input[index];
			else
				oddsum = oddsum + input[index];;
		}
		if ( evensum> oddsum)
			return evensum - oddsum;
		else
			return oddsum - evensum;
	}
	
	
	public static void main (String[] args) {
		String[] arr1 = new String[4];
		arr1[0] = "Maulik";
		arr1[1] = "Techno";
		arr1[2] = "Nidhi";
		arr1[3] = "Ankit";
		
		
		Assignment15 assignment15 = new Assignment15();
		int diff1 = assignment15.getEvenOddLengthDiff(arr1);
		System.out.println("Diff between even and odd string: " + diff1);
		
		String[] name = {"Hi", "Techno", "Credits"};
		assignment15.getmidChar(name);
		
		int[] arr2 = {12, 2, 13, 19};
		assignment15.getEvenOddDiff(arr2);
		int diff2 = assignment15.getEvenOddDiff(arr2);
		System.out.println("Diff between even and odd sum: " + diff2);
	}
}
