package chandni_bhoj;

public class Assignment_14 {

	void getMaxNumber (int [] arr) {
		int maxNum = arr[0];
		int minNum = arr[0];
		int maxOdd = 0;
		int maxEven = 0;
		for (int index =1; index < arr.length; index++) {
			if (maxNum < arr[index])
				maxNum = arr[index];
			else if (minNum > arr[index])
				minNum = arr[index];	
		}
		
		System.out.println ("Max number is " + maxNum);
		System.out.println ("Min number is " + minNum);
		System.out.println ("Difference between max and min number is " +  (maxNum - minNum));
		
		for (int index =0; index < arr.length; index++) {
			if (maxOdd < arr[index] && arr[index] % 2 != 0) 
				maxOdd = arr[index];
			else if (maxEven < arr[index] && arr[index] % 2 == 0)
				maxEven = arr[index];
		}
		System.out.println ("Difference between maxOdd and maxEven number is " + (maxOdd - maxEven ));
	}
	
	public static void main(String[] args) {
		Assignment_14 assignment_14 = new Assignment_14 ();
		int [] input = new int [] {1,11,44,23,55,99,23};
		assignment_14.getMaxNumber(input);
	
		
}
	
}
