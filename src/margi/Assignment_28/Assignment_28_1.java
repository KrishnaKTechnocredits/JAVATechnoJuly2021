package margi.Assignment_28;

public class Assignment_28_1 {
	
	//second highest number from array
	int getNumber(int[] input) {
		int max = input[0];
		int temp = 0;
		int secondMax = input[0];
		for(int index=1; index<input.length; index++) {
			if(max < input[index]) {
				max = input[index];
				temp = index;
			}
		}
		input[temp]=0;
		for(int index=1; index<input.length; index++) {
			if(secondMax<input[index])
				secondMax=input[index];
		}
		return secondMax;
	}
	
	public static void main(String[] args) {
		Assignment_28_1 assignment_28_1 = new Assignment_28_1();
		int[] arr = {10,23,2,11,55,43,99};
		System.out.println("Second highest number: " + assignment_28_1.getNumber(arr));
	}
}
