package kumar_Ashish.Assignment_22;

public class TotalDigits {
		void numberOfDigits(String statement){
		
		int count = 0;
		for (int index =0; index<statement.length(); index++){
			char ch = statement.charAt(index);
			if(Character.isDigit(ch)){
				count++;
			}
		}
		System.out.println("Total number of digits in Statement " + count );
	
	}
	public static void main(String[] args){
		TotalDigits totalDigits = new TotalDigits();
		totalDigits.numberOfDigits("Te5ch6no6cr4ed8it9s");
	
	}

}
