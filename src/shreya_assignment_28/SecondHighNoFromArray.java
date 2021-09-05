package shreya_assignment_28;

public class SecondHighNoFromArray {
	int getSecondHighNumber(int[] arr) {
		int highestNumber=arr[0];
		int secondHighestNumber=arr[0];
		for(int index=0;index<arr.length;index++) {
			if(arr[index]>highestNumber) {
				secondHighestNumber=highestNumber;
				highestNumber=arr[index];
			}
			else if(arr[index]>secondHighestNumber) {
				secondHighestNumber=arr[index];
			}
		}
		return secondHighestNumber;
	}
		public static void main(String[] args) {
			SecondHighNoFromArray number=new SecondHighNoFromArray();
			int[] arr= {10,23,2,11,55,43,99};
			System.out.println("Second highest number is: "+number.getSecondHighNumber(arr));
	}

}
