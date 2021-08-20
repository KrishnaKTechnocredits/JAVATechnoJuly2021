package akshay;

public class Program_1 {
	
	int count = 0;
	
	int getCountPositiveNumber(int[] num) {
		for(int index = 0; index< num.length; index++) {
			if(num[index]>0)
				count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		Program_1 program1 = new Program_1();
		int[] input = {1,-11,-44,23,55,-99,-23,-22};
		System.out.println("Count of positive numbers in array: " +program1.getCountPositiveNumber(input));
	}
	
}
