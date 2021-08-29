package trupti;


public class Test1 {
	int sumOfDigitInArray(String str) {
		int sum=0;
		for(int index=0; index<str.length();index++) {
			if(Character.isDigit(str.charAt(index))) {
				sum=sum+Character.getNumericValue(str.charAt(index));
			}
		}
		return sum;
	}
	
	int getNumberInArray(String[] str) {
		int sumOfAllDigit=0;
		for(int index=0; index<str.length;index++) {
			sumOfAllDigit+=sumOfDigitInArray(str[index]);
		
			
		}
		return sumOfAllDigit;
	}
	
	public static void main(String[] args) {
		Test1 test1=new Test1();
		String[] input1= {"t2e4c", "2h7no","3h6h2h5","1mk3","k9g8"};
		System.out.println("Sum of digit "+test1.getNumberInArray(input1));
	}

}
