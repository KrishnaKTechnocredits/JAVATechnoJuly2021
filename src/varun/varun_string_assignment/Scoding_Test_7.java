package varun.varun_string_assignment;

public class Scoding_Test_7 {
	int count =0;
	void countTripleinIncreasingOrder(int [] arr) {
		int num1;
		int num2;
		int num3;
		for(int index=0;index<arr.length-2;index++) {
			num1 = arr[index];
			num2 = arr[index+1];
			num3 = arr[index+2];
			if(num2>num1 && num3>num2) {
				count++;
			}
		}
		if(count !=0) {
			System.out.println("Total " + count + " triplets in a given array");
		}
	}
	
	public static void main(String[] args) {
		int [] input = {10,9,11,6,23,25,22,66,74};
		Scoding_Test_7 scoding_Test_7 = new Scoding_Test_7();
		scoding_Test_7.countTripleinIncreasingOrder(input);
	}
}
