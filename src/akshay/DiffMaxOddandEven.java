package akshay;

public class DiffMaxOddandEven {
	
	int getMaxOdd(int[] num) {
		int maxOddNumber = 0;
		for(int index = 0; index < num.length; index++) {
			if (num[index] > maxOddNumber && num[index]%2 != 0) {
				maxOddNumber = num[index];
			}
		}
		
		return maxOddNumber;
	}
	
	int getMaxEven(int[] num) {
		int maxOddNumber = 0;
		for(int index = 0; index < num.length; index++) {
			if (num[index] > maxOddNumber && num[index]%2 == 0) {
				maxOddNumber = num[index];
			}
		}
		
		return maxOddNumber;
	}
	
	int getDiffMaxOddandEven(int[] num) {
		int diffMaxOddandEven = 0;
		if(getMaxEven(num)<getMaxOdd(num))
			diffMaxOddandEven = getMaxOdd(num)-getMaxEven(num);
		else
			diffMaxOddandEven = getMaxEven(num)-getMaxOdd(num);
		return diffMaxOddandEven;
	}
	
	public static void main(String[] args) {
		DiffMaxOddandEven diffMaxEvenandOdd = new DiffMaxOddandEven();
		int[] input = {1,11,44,23,55,99,23,22};
		System.out.println("Maximum odd number from array: " + diffMaxEvenandOdd.getMaxOdd(input));
		System.out.println("Maximum even number from array: " + diffMaxEvenandOdd.getMaxEven(input));
		System.out.println("Differnce between maximun odd and evevn number from array: " + diffMaxEvenandOdd.getDiffMaxOddandEven(input));
	}
}
