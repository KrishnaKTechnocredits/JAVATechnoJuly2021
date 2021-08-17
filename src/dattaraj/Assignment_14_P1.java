package dattaraj;

public class Assignment_14_P1 {
	int getMaxNumFromArray(int[] num ) {
		int max=num[0];
		for(int index=0;index<num.length;index++) {
			if(num[index]>max)
				max=num[index];
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1,11,44,23,55,99,23};
		Assignment_14_P1 arrayP1= new Assignment_14_P1();
		System.out.println("Maximum number from given array is "+arrayP1.getMaxNumFromArray(input));
	}

}
