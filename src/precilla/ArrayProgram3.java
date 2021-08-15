package precilla;

public class ArrayProgram3 {
	int[] output=new int[5];
	void getPositiveNumbers(int num) {	
		for(int index=0;index<output.length;index++)
		{
			num--;
			output[index]=num;
			System.out.print(output[index]+" ");
		}
	}
	public static void main(String[] args) {
		ArrayProgram3 arrayProgram3=new ArrayProgram3();
		System.out.println("\n5 smaller numbers of the given number : ");
		arrayProgram3.getPositiveNumbers(50);
	}
}
