package precilla;

public class ArrayProgram1{
	int count=0;
	int getPositiveNumbers(int[] array) {
		for(int index=0;index<array.length;index++)
		{
			System.out.print(array[index]+" ");
			if(array[index]>0) 
				count++;
		}
		return count;
	}
	public static void main(String[] args) {
		ArrayProgram1 arrayProgram1=new ArrayProgram1();
		int[] array= {1,-11,-44,23,55,-99,-23,-22};
		System.out.print("Given array:");
		System.out.println("\nCount of positive numbers from given array : "+arrayProgram1.getPositiveNumbers(array));
	}
}
