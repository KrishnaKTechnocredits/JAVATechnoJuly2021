package dattaraj;

public class Assignment_14_P2 {
	int getMinNumFromArray(int[] num ) {
		int min=num[0];
		for(int index=0;index<num.length;index++) {
			if(num[index]<min)
				min=num[index];
		}
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1,11,44,23,55,99,23};
		Assignment_14_P2 arrayP2 = new Assignment_14_P2();
		System.out.println("Minimum number from given array is "+arrayP2.getMinNumFromArray(input));
	}

}
