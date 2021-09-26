package swati;

public class FindSumofAlldigitArray {
	

	int sumOfTotalDigits(String inputStr) {
		int sum=0;
		for(int index=0;index<inputStr.length();index++) {
			if(Character.isDigit(inputStr.charAt(index))) {
				
				sum=sum+Character.getNumericValue((inputStr.charAt(index)));
			}
		}
		System.out.println("\nSum of all the digits in "+inputStr+" is:"+ sum);
		return sum;
	}
	
	
	void totalSum(String[] input){
		int totalSum=0;
		for(int index=0;index<input.length;index++){
			totalSum=totalSum+sumOfTotalDigits(input[index]);
			
		}
		System.out.println("\nTotal Sum :" +totalSum);
	}
	
	
	public static void main(String[] arg) {
		FindSumofAlldigitArray totalDSum =new FindSumofAlldigitArray();
		String[] input={"t2e4c","2h7no", "3h6h2h5", "1mk3", "k9g8"};
		totalDSum.totalSum(input);
		
		
	}
}
