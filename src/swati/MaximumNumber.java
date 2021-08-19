package swati;
class MaximumNumber{

	int returnMaxNo(){
	int[] input={1,11,44,23,55,99,23};
	int maxNumber=0;
	for(int index=0;index<input.length;index++){
		if(maxNumber<input[index])
		{
			maxNumber=input[index];
		}
	}
		return maxNumber;
	}
	
	public static void main(String[] a){
		MaximumNumber maxNum=new MaximumNumber();
		System.out.println("Maximum number from given array: "+ maxNum.returnMaxNo());
	}
}