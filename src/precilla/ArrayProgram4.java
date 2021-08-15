package precilla;

public class ArrayProgram4 {

	int getMaximumNumbers(int[] array) {
		int index=0;
		int maximum=array[index];
		for(index=0;index<array.length;index++)
		{
			System.out.print(array[index]+" ");
			if(array[index]>maximum) 
				maximum=array[index];
		}
		return maximum;
	}
	public static void main(String[] args) {
		ArrayProgram4 arrayProgram4=new ArrayProgram4();
		int[] array= {1,11,44,23,55,99,23};
		System.out.print("Given array:");
		System.out.println("\nMaximum Number from given array :"+arrayProgram4.getMaximumNumbers(array));
	}
}
