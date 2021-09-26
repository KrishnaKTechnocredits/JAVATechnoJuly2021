package margi;

public class Assignment_14_2 {

	//min number from array
	int processData(int[] num) {
		int min=num[0];
		for(int index = 0; index < num.length; index++) {
			if(min>num[index]) 
				min=num[index];
		}
		return min;
	}
		
	void minNumber() {
		int[] input = {1,11,44,23,55,99,23};
		System.out.println("Minimum number is " + processData(input));
	}
		
	public static void main(String[] args) {
		Assignment_14_2 min = new Assignment_14_2();
		min.minNumber();
	}
}
