package akshay;


public class MaxNumberArray {
	
	int maxNumberArray(int[] num) {
		int maxNumber = num[0];
		for(int index = 0; index < num.length; index++) {
			if(num[index] > maxNumber)
				maxNumber = num[index];
		}	
		return maxNumber;
	}
	
	public static void main(String[] args) {
		MaxNumberArray maxnumber = new MaxNumberArray();
		int[] input = {1,11,44,23,55,99,23};
		
		System.out.println("Biggest Number from Array: " +maxnumber.maxNumberArray(input));
	}
}
