package mratunjay.Assignment_12_To_18;

public class Assignment_13 {

	void getFiveSmallerNumbers(int num) {
		int[] input = new int[5];
		
		for (int index = 0; index < 5; index++) {
			
				input[index] = num - 1;
				System.out.println(input[index]);
				num--;
		}
		
	}
	
	int getCountPositiveNumbers(int[] num ) {
		int count=0;
		for(int index=0;index<num.length;index++) {
			if(num[index]>0)
				count++;
		}
		return count;
	}
	
	int getCountZeroNumber(int[] num) {
		int count=0;
		for(int index=0;index<num.length;index++) {
			if(num[index]==0)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Assignment_13 A_13 = new Assignment_13();
		A_13.getFiveSmallerNumbers(40);
		int[] input = {1,-11,0,0,55,0,-23,0};
		System.out.println("Count number of zero's in given array: "+A_13.getCountZeroNumber(input));
		int[] input1 = {1,-11,-44,23,55,-99,-23,-22};
		System.out.println("Count of positive numbers from given array "+A_13.getCountPositiveNumbers(input1));
	}

}
