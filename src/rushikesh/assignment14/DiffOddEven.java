package rushikesh.assignment14;

public class DiffOddEven {

	int getDiff(int[] input) {
	int maxOdd=input[0];
	int maxEven=input[0];
	
	for(int index=0;index<input.length;index++) {
		if(input[index]%2==0) {
			if(input[index]>maxEven) 
				maxEven=input[index];
			
		}else {
			if(input[index]>maxOdd) 
				maxOdd=input[index];
		}
	}
	return maxOdd-maxEven;
}
	
	
	
	public static void main(String[] args) {
		int[] input = {1,11,44,23,55,99,23,22};
		DiffOddEven diffOddEven=new DiffOddEven();
		int diff=diffOddEven.getDiff(input);
		System.out.println("Difference between Max Odd and Max even is ");
		System.out.println(diff);
		
	}

}
