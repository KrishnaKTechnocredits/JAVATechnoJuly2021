package purshottamJoshi;

class Assignment28{
	
	int secondHighest(int[] input){
		int max=0;
		int secondmax=0;
		int innerindex =0;
		for(int index=0; index < input.length;index++){
			if(input[index] > max){
				max = input[index];
				
			}
			if(input[innerindex] > secondmax && input[innerindex] < max){
				secondmax= input[innerindex];
				innerindex++;
			}
		}
		return secondmax;
	}
	int[] getSortedArray(int[] input) {
		int temp = 0;
		for (int index = 0; index < input.length; index++) {
			for (int innerindex = index + 1; innerindex < input.length; innerindex++) {
				if (input[index] < input[innerindex]) {

					temp = input[index];
					input[index] = input[innerindex];
					input[innerindex] = temp;

				}
			}
		}
		return input;
	}

	void nthHighestNumber(int[] input, int n) {
		int[] output = getSortedArray(input);
		for (int index = 0; index < output.length; index++) {
			if (index == n - 1)
				System.out.println(n+"th Highest number in Array : " + output[index]);
		}
	}
	
	
	public static void main(String[] args){
		int[] input = {50,30,20,40,10,60};
		Assignment28 assignment28 = new Assignment28();
		System.out.println("Second Highest Number in Array : "+assignment28.secondHighest(input));
		assignment28.nthHighestNumber(input,3);
	}
}