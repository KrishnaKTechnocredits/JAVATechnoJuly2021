package precilla;

public class ArrayProgram2 {
	int count=0;
	int getPositiveNumbers(int[] array) {
		for(int index=0;index<array.length;index++)
		{
			System.out.print(array[index]+" ");
			if(array[index]==0) 
				count++;
		}
		return count;
	}
	public static void main(String[] args) {
		ArrayProgram2 arrayProgram2=new ArrayProgram2();
		int[] array= {1,-11,0,0,55,0,-23,0};
		System.out.print("Given array:");
		System.out.println("\nCount of number of zero's in given array : "+arrayProgram2.getPositiveNumbers(array));
	}
}
