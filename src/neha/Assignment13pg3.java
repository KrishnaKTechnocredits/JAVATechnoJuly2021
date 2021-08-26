package neha;
/*program 3 : write a method which returns 5 smaller numbers of the given number.
input : 50
output : 49, 48, 47, 46, 45*/
public class Assignment13pg3 {
	int[] findFiveSmallerNumbers(int number) {
		int[] output=new int[5];
		for(int index=0;index<output.length;index++) {
			number--;
			output[index]=number;
		}
		return output;
			}
	public static void main(String[] args) {
		Assignment13pg3 assignment13pg3=new Assignment13pg3();
		int input=50;
		int[] output=assignment13pg3.findFiveSmallerNumbers(input);
		System.out.println("5 smaller numbers than input "+input+" are:");
		for(int index=0;index<output.length;index++) {
			System.out.print(output[index]+" ");
		}
	}

}
