package arti_K.Assignment_31;

public class PerfectNumInGivenRange {
	
	int isPerfectNumber(int num){
		
		int sum = 0;
		
		for(int index = 1; index <= num/2; index++){
			
			if(num % index == 0)
				sum = sum + index;
		}
	return sum;
	}
	
	void numRange(int startNum, int endNum) {
		int countPerfectNum = 0;
		for(int index = startNum; index <= endNum; index++) {
			int sum = isPerfectNumber(index);
			
			if(sum == index) {
				System.out.println("Given number "+index+" is Perfect Number.");
				countPerfectNum++;
			}
		}	
		if(countPerfectNum == 0)
			System.out.println("No perfect numbers exists in the range from "+startNum+" to "+endNum);
	}

	public static void main(String[] args){
		
		PerfectNumInGivenRange perfectnumber = new PerfectNumInGivenRange();
		int num1 = 40;
		int num2 = 170;
		perfectnumber.numRange(num1,num2);
	}

}
