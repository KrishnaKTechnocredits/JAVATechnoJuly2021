package genius;

public class Diffbtwnmaxoddandmaxevennumfromarray {
 
	int getDiffBetweenMaxoddAndMaxEvenNumberFromGivenArray(int[] input) {
		int maxEvenNum=input[0];
		int maxOddNum=input[0];
		for(int index=0;index<input.length;index++){
			if(input[index] %2 ==0) {
			    if(input[index]>maxEvenNum) {
			    	maxEvenNum=input[index];
			    }
			}    
			else {
				    if(input[index]>maxOddNum) 
					 maxOddNum=input[index];
			     }
			
	    }
		
		if(maxEvenNum>maxOddNum)
			return maxEvenNum-maxOddNum;
		
		else
			return maxOddNum-maxEvenNum;
	}
	
	
	public static void main(String[] args) {
		int[] input = {1,11,44,23,55,99,23};
		Diffbtwnmaxoddandmaxevennumfromarray diffbtwnmaxoddandmaxevennumfromarray = new Diffbtwnmaxoddandmaxevennumfromarray();
		System.out.println(diffbtwnmaxoddandmaxevennumfromarray.getDiffBetweenMaxoddAndMaxEvenNumberFromGivenArray(input));

	}

}
