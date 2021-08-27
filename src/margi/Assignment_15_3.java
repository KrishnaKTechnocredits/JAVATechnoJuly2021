package margi;

public class Assignment_15_3 {
	
	//return difference between sum of even number - sum of odd numbers
	int processData(int[] input) {
		int sumEven = 0, sumOdd = 0;
		for(int index = 0; index < input.length; index++) {
			if(input[index]%2==0)
				sumEven += input[index];
			else
				sumOdd += input[index];
		}
		return Math.abs(sumEven - sumOdd);
	}
	
	void setData() {
		int[] num = {12,2,13,9};
		System.out.println(processData(num));
	}
	
	public static void main(String[] args) {
		Assignment_15_3 numbers = new Assignment_15_3();
		numbers.setData();
	}
}
