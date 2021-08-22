package swati;
class MinimumNumber{

	int returnSmallerNo(){
	int[] input={1,11,44,23,55,99,23}; 
	int smallerNumber=input[0];
	for(int index=0;index<input.length;index++){
		if(input[index]<smallerNumber){
		
			smallerNumber=input[index];
		}
	}
		return smallerNumber;
	}
	
	public static void main(String[] a){
		MinimumNumber minNum=new MinimumNumber();
		System.out.println("Minimum number from given array: "+ minNum.returnSmallerNo());
	}
}