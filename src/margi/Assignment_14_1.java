package margi;

public class Assignment_14_1 {
	
	//max number from array
	int processData(int[] num) {
		int max=num[0];
		for(int index = 0; index < num.length; index++) {
			if(max<num[index])
				max=num[index];
		}
		return max;
	}
	
	void maxNumber() {
		int[] input = {1,11,44,23,55,99,23};
		System.out.println("Maximum number is " + processData(input));
	}
	
	public static void main(String[] args) {
		Assignment_14_1 max = new Assignment_14_1();
		max.maxNumber();
	}
}
