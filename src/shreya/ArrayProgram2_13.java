// Program to count number of zero's from given array.
package shreya;

public class ArrayProgram2_13 {
	static int count=0;
	int getCountOfZeros(int[] num) {
		for(int index=0;index<num.length;index++) {
			if(num[index]==0)
				count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		int[] input=  {1,-11,0,0,55,0,-23,0};
		ArrayProgram2_13 ArrayProgram13=new ArrayProgram2_13();
		ArrayProgram13.getCountOfZeros(input);
		System.out.println("Count of zeros in an array is "+count);
		
		// TODO Auto-generated method stub

	}

}
