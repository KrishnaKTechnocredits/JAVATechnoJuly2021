package kumar_Ashish.SCoding_Test;

public class SummationOfDigits {
	
	void sumOfDigits(){
		String[] input = {"t2e4c", "2h7no", "3h6h2h5", "1mk3", "k9g8"};
		//int number = input.length;
		int sum = 0;
		//String[] arr = input.split(", ");
		for (int index = 0; index<input.length; index++){
			
			for(int index1 = 0; index1<input[index].length(); index1++){
				
				char ch = input[index].charAt(index1);
				if(Character.isDigit(ch)){
					sum = sum + Character.getNumericValue(ch);
				
				}
				//input[index] = t2e4c;
			
			}

		}
		System.out.println("summation of all the digits from all the strings " + sum);
		
	}
	
	public static void main(String[] args){
		SummationOfDigits summationOfdigits = new SummationOfDigits();
		summationOfdigits.sumOfDigits();
	
	}

}
