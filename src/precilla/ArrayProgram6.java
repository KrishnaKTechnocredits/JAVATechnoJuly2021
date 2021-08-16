package precilla;

public class ArrayProgram6 {
	int getDifferenceBetweenMaxandMinNos(int[] array) {
		int index=0,difference=0;
		int maximum=array[index];
		int minimum=array[index];
		for(index=0;index<array.length;index++)
		{
			System.out.print(array[index]+" ");
			if(array[index]>maximum) 
				maximum=array[index];
		}
		for(index=0;index<array.length;index++)
		{
			if(array[index]<minimum) 
				minimum=array[index];
		}
		difference = maximum-minimum;
		return difference;
	}
	public static void main(String[] args) {
		ArrayProgram6 arrayProgram6=new ArrayProgram6();
		int[] array= {1,11,44,23,55,99,23};
		System.out.print("Given array:");
		System.out.println("\nDifference between maximum and minimum numbers from given array :"+arrayProgram6.getDifferenceBetweenMaxandMinNos(array));
	}

}
