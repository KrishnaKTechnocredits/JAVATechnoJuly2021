package margi;

public class Assignment_14_4 {
	
	//difference between max odd number and max even number; ans must be positive
	int processData(int[] num) {
		int maxEven=num[0];
		int maxOdd=num[0];
		for(int index = 0; index < num.length; index++) {
			if(maxEven<num[index]) {
				if(num[index]%2==0) 
					maxEven=num[index];
			}
			if(maxOdd<num[index]) {
				if(num[index]%2!=0) 
					maxOdd=num[index];
			}
		}
		return Math.abs(maxEven-maxOdd);
	}
			
	void diffNumber() {
		int[] input = {1,11,44,23,55,99,23};
		System.out.println("Difference of maximum Even and maximum Odd number is " + processData(input));
	}
			
	public static void main(String[] args) {
		Assignment_14_4 diff = new Assignment_14_4();
		diff.diffNumber();
	}
	
}
