//Program to which returns 5 smaller numbers of the given number
package shreya;

public class ArrayProgram13_3 {
void getSmallerNumber(int num) {
	int[] output = new int[5];
	for (int index=0;index<5;index++) {
		num--;
		output[index]=num;
		System.out.println(output[index]);
	}
	
}
	public static void main(String[] args) {
		
		ArrayProgram13_3 arrayProgram13_3=new ArrayProgram13_3();
		arrayProgram13_3.getSmallerNumber(50);
		

	}

}
