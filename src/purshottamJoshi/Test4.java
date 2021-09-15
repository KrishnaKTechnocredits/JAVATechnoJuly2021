package purshottamJoshi;

class Test4{
	
	void shiftZeros(int[] input){
		int nonZeros=0;
		int temp=0;
		for(int index=0; index < input.length; index++) {
			if(input[index] != 0  ){
				temp= input[nonZeros];
				input[nonZeros]=input[index] ;
				input[index]=temp;
				nonZeros++;
			}
		}
	}
	
	void displayArray(int[] input){
		for(int index=0; index < input.length; index++) {
			System.out.println(input[index]);
		}
	}
	
	public static void main(String[] args){
		int[] arr = {1,0,0,6,0,2,3,0,4,0,5};
		Test4 test4 = new Test4();
		test4.shiftZeros(arr);
		test4.displayArray(arr);
	}
}