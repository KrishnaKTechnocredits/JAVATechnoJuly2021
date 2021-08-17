package somnath;
public class FindMaxProgram1 {

    int arr(int[] input) {
		int maxNum=input[0];
		for(int index=0;index<input.length;index++) {
			if(input[index]>maxNum) {
				maxNum=input[index];
			}
		}
		return maxNum;

	}

	public static void main(String[] args) {
		int[] input = {1,11,44,23,55,99,23};
		FindMaxProgram1 findMax_1= new FindMaxProgram1();
		int max=findMax_1.arr(input);
		System.out.println("----------*****----------");
		System.out.println("Max Number is:>");
		System.out.println(max);
	    System.out.println("----------*****----------");
	}
}