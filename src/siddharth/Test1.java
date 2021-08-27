package siddharth;

public class Test1 {
int calculateSumOfAll(String input){
		
		int sum = 0;
		
		for(int index=0; index<input.length(); index++){
			char ch = input.charAt(index);
			if(Character.isDigit(ch)){
				sum = sum + Character.getNumericValue(ch);
			}
		} 
		return sum;
	}
	
	void sumOfAllDigit(String[] input){
		
		int sum =0;
		for(int index=0; index<input.length; index++){
			sum = sum + calculateSumOfAll(input[index]);
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
	
		String input[] = {"t2e4c","2h7no","3h6h2h5","1mk3","k9g8"};
		
		Test1 test = new Test1();
		test.sumOfAllDigit(input);
		
	}
}
