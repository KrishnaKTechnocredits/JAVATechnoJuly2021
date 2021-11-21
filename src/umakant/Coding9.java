package umakant;

public class Coding9 {
	
	int getNearestNumber(int[] input) {
		int output=Integer.MIN_VALUE;
		for(int num:input) {
			if(num < 0 && num > output)
					output = num;
		}
		return output;
	}
	
	public static void main(String[] args) {
		int[] array = {15,16,9,1,-3,-9,-1};
		System.out.println(new Coding9().getNearestNumber(array));
	}

}
