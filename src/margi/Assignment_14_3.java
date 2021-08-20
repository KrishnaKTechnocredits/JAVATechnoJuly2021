package margi;

public class Assignment_14_3 {

	//difference of max and min number
	int processData(int[] num) {
		int min=num[0];
		int max=num[0];
		for(int index = 0; index < num.length; index++) {
			if(min>num[index]) 
				min=num[index];
			
			if(max<num[index])
				max=num[index];
		}
		return max-min;
	}
			
	void diffNumber() {
		int[] input = {1,11,44,23,55,99,23};
		System.out.println("Difference of maximum and minimum number is " + processData(input));
	}
			
	public static void main(String[] args) {
		Assignment_14_3 diff = new Assignment_14_3();
		diff.diffNumber();
	}
}
