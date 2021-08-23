package shreya_assignment_19;

public class SumOfNumbers {
	
	int getSumOfNumbers(String str) {
		int sum = 0;
		String[] arr = str.split(" ");
		for(int index = 0; index < arr.length; index++) {
			sum = sum + Integer.parseInt(arr[index]);
		}
		return sum;
		
	}
	public static void main(String[] args) {
		SumOfNumbers sumOfNumbers=new SumOfNumbers();
		String input="10 10 20 30";
		System.out.println("Sum of the numbers is "+"\""+ input+"\""+" is "+sumOfNumbers.getSumOfNumbers(input));
	}

}
