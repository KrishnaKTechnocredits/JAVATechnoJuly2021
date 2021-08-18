// Program to return count of positive numbers from given array.
package shreya;

public class ArrayProgram13 {
	static int count=0;
	int getCountPositiveNumbers(int[] num) {
		for(int index=0;index<num.length;index++) {
			if(num[index]>0)
				count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		int[] input= {1,-11,-44,23,55,-99,-23,-22};
		ArrayProgram13 ArrayProgram13=new ArrayProgram13();
		ArrayProgram13.getCountPositiveNumbers(input);
		System.out.println("Count  positive numbers in an array is "+count);
		
		// TODO Auto-generated method stub

	}

}
