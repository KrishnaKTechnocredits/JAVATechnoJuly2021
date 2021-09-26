package precilla;

public class ArrayProgram5 {
	int getMinimumNumbers(int[] array) {
		int index=0;
		int minimum=array[index];
		for(index=0;index<array.length;index++)
		{
			System.out.print(array[index]+" ");
			if(array[index]<minimum) 
				minimum=array[index];
		}
		return minimum;
	}
	public static void main(String[] args) {
		ArrayProgram5 arrayProgram5=new ArrayProgram5();
		int[] array= {1,11,44,23,55,99,23};
		System.out.print("Given array:");
		System.out.println("\nMinimum Number from given array :"+arrayProgram5.getMinimumNumbers(array));
	}

}
