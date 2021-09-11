package indrani;

public class CodingTest7_counttripletsinincreasingorder {
	
	int getTripletCountIncOrder(int[] input) {

		int count=0;
		for(int index=0;index<input.length-2;index++) {
			int number=input[index];
			if(number<input[index+1]) {
				if(input[index+1]<input[index+2]) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] a) {
		CodingTest7_counttripletsinincreasingorder tripletcount=new CodingTest7_counttripletsinincreasingorder();
		int[] input= {10,9,11,6,23,25,22,66,34};
		System.out.println("Count of triplets in the given series : "+ tripletcount.getTripletCountIncOrder(input));
	}
}
