package purshottamJoshi;

class Assignment31_1{
	
	int count=0;
	void isPerfectNumber(long input){
		int sum=0;
		for(int index=1; index < input; index++){
			if(input % index == 0){
				sum = sum + index;
			}
		}
		if(input==sum){
			count++;
			System.out.println(input + " is a perfect number");
		}
	}
	
	void perfectNumberInRange(int startIndex , int endIndex){
		for(int index= startIndex; index <= endIndex; index++){
			isPerfectNumber(index);
			
		}
	}
	
	public static void main(String[] args){
		Assignment31_1 assignment31_1 = new Assignment31_1();
		assignment31_1.isPerfectNumber(6);
		assignment31_1.perfectNumberInRange(1,4000);
	}
}