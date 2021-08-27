package kumar_Ashish.Assignment_22;

public class Summation {
		void sumOfDigits(String statement){
		
		int sum = 0;
		for (int index =0; index<statement.length(); index++){
			char ch = statement.charAt(index);
			if(Character.isDigit(ch)){
				sum = sum + Character.getNumericValue(ch);
			}
		}
		System.out.println("sum of all the digits in Statement " + sum );
	
	}
	public static void main(String[] args){
		Summation summation = new Summation();
		summation.sumOfDigits("Te5ch6no6cr4ed8it9s");
		//System.out.println("sum of all the digits in Statement " + sum );
	
	}


}
