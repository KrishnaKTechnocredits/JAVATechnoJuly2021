package purshottamJoshi;

class Assignment13 {
	
	int countPositive(int[] num){
		int count=0;
		for(int index =0; index < num.length; index++) {
			if(num[index] > 0) {
				count++;
			}
		}
		return count;
	}
	int countZeroNumber(int[] num) {
		int count=0;
		for(int index=0;index<num.length;index++) {
			if(num[index]==0)
				count++;
		}
		return count;
	}
	int[] fiveSmallerNumbers(int num) {
		int[] input = new int[5];
		int count = 0;
		for (int index = num; index > num - 5; num--) {
			if (count != 5) {
				input[count] = num - 1;
				System.out.println(input[count]);
				count++;
			}
		}
		return input;
	}
	
	
	
	public static void main(String[] args) {
		int[] input = {1,-11,0,0,55,0,-23,0};
		int[] positive = {1,-11,-44,23,55,-99,-23,-22};
		Assignment13 assignment13 = new Assignment13();
		System.out.println("Total Positive Number in array : "+assignment13.countPositive(positive));
		System.out.println("Total Zeros in given array : "+assignment13.countZeroNumber(input));
		assignment13.fiveSmallerNumbers(50);
		
		
	}
	
}