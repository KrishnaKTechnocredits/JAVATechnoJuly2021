package poojaJoshi;

public class Assignment_14_2 {
	
	int minNum=99;
	int count=0;
	
	void minNum(int[] num) {
		for (int index = 0; index < num.length; index++) {
			if (num[index] <= minNum) {
				minNum = num[index];
				count--;

			}
		}
		System.out.println("Minimum number is " +minNum);
		//System.out.println("*************************************");
	}
	
	public static void main(String[] args) {
		Assignment_14_2 assignment_14_2 = new Assignment_14_2();
		int[] input = {1,11,44,23,55,99,23};
		assignment_14_2.minNum(input);
		
	}

}
