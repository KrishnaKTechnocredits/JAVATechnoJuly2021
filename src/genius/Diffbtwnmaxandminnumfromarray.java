package genius;

public class Diffbtwnmaxandminnumfromarray {
	
	int getDiffBtwnMaxAndMinNumFromArray(int[] input) {
		int maxNum=input[0];
		int minNum=input[0];
	    for(int index=0;index<input.length;index++){
		    if(input[index]>maxNum) 
			    maxNum=input[index];
		    
		    if(input[index]<minNum) 
			    minNum=input[index];
	    
	    }
	    return maxNum-minNum;
	}

	public static void main(String[] args) {
		int[] input = {1,11,44,23,55,99,23};
		Diffbtwnmaxandminnumfromarray diffbtwnmaxandminnumfromarray = new Diffbtwnmaxandminnumfromarray();
		System.out.println(diffbtwnmaxandminnumfromarray.getDiffBtwnMaxAndMinNumFromArray(input));
	}

}
