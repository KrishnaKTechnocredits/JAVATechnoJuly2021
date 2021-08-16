package rushikesh.assignment14;

public class FindMax {
	

	
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
		FindMax findMax= new FindMax();
		int max=findMax.arr(input);
		System.out.println("Max Number is:");
		System.out.println(max);
	}
}
