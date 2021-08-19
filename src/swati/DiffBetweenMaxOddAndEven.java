package swati;
class DiffBetweenMaxOddAndEven{

	int returnMaxOdd(int[] input){
	int maxOdd=0;
	for(int index=0;index<input.length;index++){
		if(input[index]%2!=0){
			if(maxOdd<input[index])
			{
				maxOdd=input[index];
			}
		}
	}
		return maxOdd;
	}
	
	int returnMaxEven(int[] input){
	int maxEven=0;
	for(int index=0;index<input.length;index++){
		if(input[index]%2==0){
			if(maxEven<input[index])
			{
				maxEven=input[index];
			}
		}
	}
		return maxEven;
	}
	
	int returnDiff(int maxE,int maxO){ //difference should be positive
		int diff=0;
		if(maxO>maxE){
			diff=maxO-maxE;
			return diff;
		}
		else{
			diff=maxE-maxO;
			return diff;
		}
	}
	
	public static void main(String[] a){
		int[] input = {1,11,44,23,55,99,23,22};
		DiffBetweenMaxOddAndEven diffMaxOddEven=new DiffBetweenMaxOddAndEven();
		int maxeven=diffMaxOddEven.returnMaxEven(input);
		int maxodd=diffMaxOddEven.returnMaxOdd(input);
		System.out.println("Difference between max odd number and max even number from given array:" + diffMaxOddEven.returnDiff(maxeven,maxodd));
	}
}