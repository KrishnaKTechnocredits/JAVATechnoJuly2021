package santosh_Assignment14;
public class FindMinProgram2 {
	int getMinNum(int[] input) {
		int minNum=input[0];
		for(int index=0;index<input.length;index++) {
			if(input[index]<minNum) {
				minNum=input[index];
			}

		}
		return minNum;

	}

	public static void main(String[] args) {
		int[] input = {1,11,44,23,55,99,23};
		FindMinProgram2 findMin=new FindMinProgram2();
		int min=findMin.getMinNum(input);
		System.out.println("~~~~~~~~~~~****~~~~~~~~~");
		System.out.println("Minimum Number is:>");
		System.out.println(min);
		System.out.println("~~~~~~~~~~~****~~~~~~~~~");
	}
}
