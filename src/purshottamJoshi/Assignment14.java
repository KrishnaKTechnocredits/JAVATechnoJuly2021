package purshottamJoshi;

class Assignment14{
	int maxNumberFromArray(int[] num ) {
		int max=0;
		for(int index=0;index<num.length;index++) {
			if(num[index] > max)
				max = num[index];
		}
		return max;
	}
	int minNumberFromArray(int[] num ) {
		int min=num[0];
		for(int index=0;index<num.length;index++) {
			if(num[index] < min)
				min = num[index];
		}
		return min;
	}
	int maxMinDifference(int[] num) {
		int min = num[0];
		int max = 0;
		for (int index = 0; index < num.length; index++) {
			if (num[index] < min)
				min = num[index];
			if (num[index] > max)
				max = num[index];

		}
		return max - min;
	}
	int maxOddMaxEvenDifference(int[] num) {
		int maxEven = 0;
		int maxOdd = 0;
		for (int index = 0; index < num.length; index++) {
			if (num[index] % 2 == 0) {
				if (num[index] > maxEven)
					maxEven = num[index];
			} else if (num[index] > maxOdd)
				maxOdd = num[index];
		}
		if (maxOdd - maxEven > 0)
			return maxOdd - maxEven;
		else
			return maxEven - maxOdd;
	}
	
	
	public static void main(String[] args){
		int[] input = {1,11,44,23,55,99,23};
		int[] minimum = {1,11,44,23,55,99,23};
		int[] diff = {1,11,44,23,55,99,23};
		int[] maxOddmaxEven = {1,11,44,23,55,99,23,22};

		Assignment14 assignment14 = new Assignment14();
		System.out.println("Maximum Number in given Array : "+assignment14.maxNumberFromArray(input));
		System.out.println("Minimum Number in given Array : "+assignment14.minNumberFromArray(minimum));
		System.out.println("Difference between Max and Min Number : "+assignment14.maxMinDifference(diff));
		System.out.println("Difference between maxOdd and maxEven Number : "+assignment14.maxOddMaxEvenDifference(maxOddmaxEven));
	}
	

}