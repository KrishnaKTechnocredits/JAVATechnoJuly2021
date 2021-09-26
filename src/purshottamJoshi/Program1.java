package purshottamJoshi;

class Program1{
	
	int getElementLengthsum(String[] arr){
		int lengthsum = 0;
		for(int index=0;index<arr.length;index++){
			lengthsum = lengthsum + arr[index].length();
		}
		return lengthsum;
	}
	int processData(String[] arr){
		int evenSum=0;
		int oddSum=0;
		int diffOfEvenOddSum=0;
		for(int index=0; index < arr.length;index++) {
			if(arr[index].length() % 2 == 0){
			evenSum = evenSum+arr[index].length();
			}
			 if(arr[index].length() % 2 != 0){
				
				oddSum = oddSum + arr[index].length();
			}
		}
		diffOfEvenOddSum = evenSum - oddSum;
		return diffOfEvenOddSum;
	}
	public static void main(String[] args){
		String[] strArray = new String[4];
		strArray[0]= "Maulik";
		strArray[1]= "Techno";
		strArray[2]= "Nidhi";
		strArray[3]= "Ankit";
		Program1 program1 = new Program1();
		System.out.println(" Difference of evenSum and oddSum : "+program1.processData(strArray));
		
	}
}