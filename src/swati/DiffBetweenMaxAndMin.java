package swati;
class DiffBetweenMaxAndMin{

	int returnMaxNo(int[] input){
	int maxNumber=0;
	for(int index=0;index<input.length;index++){
		if(maxNumber<input[index])
		{
			maxNumber=input[index];
		}
	}
		return maxNumber;
	}
	
	int returnSmallerNo(int[] input){ 
	int smallerNumber=input[0];
	for(int index=0;index<input.length;index++){
		if(input[index]<smallerNumber){
		
			smallerNumber=input[index];
		}
	}
		return smallerNumber;
	}
	
	public static void main(String[] a){
		int[] input = {1,11,44,23,55,99,23};
		DiffBetweenMaxAndMin diffMinMax=new DiffBetweenMaxAndMin();
		System.out.println("Difference between max and min number from given array: "+ (diffMinMax.returnMaxNo(input)-diffMinMax.returnSmallerNo(input)));
	}
}