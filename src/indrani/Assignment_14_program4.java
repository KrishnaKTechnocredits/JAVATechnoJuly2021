package indrani;

public class Assignment_14_program4 {
	
	int getDiffOfMaxOddMaxEven(int[] num) {
		int maxEven = 0;
		int maxOdd = 0;
		for(int index=0; index<num.length;index++) {
			if(num[index]%2==0) {
				if(num[index]>maxEven)
					maxEven=num[index];
			}
			else if (num[index]>maxOdd)
				maxOdd=num[index];
			}
				
		if(maxOdd-maxEven>0)
			return (maxOdd-maxEven);
		else
		    return (maxEven-maxOdd);	
	}
	public static void main(String[] args) {
		int[] input = {12,11,44,10,45,107,98};
		Assignment_14_program4 program4 = new Assignment_14_program4();
		int output=program4.getDiffOfMaxOddMaxEven(input);
		System.out.println("Difference between maximum even and maximum odd number from the array : "+output );
	}
}
