package Sourabh_Assignment_25;

public class SumOfNum{

	void sumOfStringNum(String input){
	int sum = 0;
	String str = "";

		for(int index = 0; index < input.length(); index++){

			if(index < input.length() && Character.isDigit(input.charAt(index))) {
				str = str + input.charAt(index);
			//	System.out.println(str);
			}
			else{
				if(str != "")
					sum = sum + Integer.parseInt(str);
					str = "";
			}	
		}
		System.out.println("Sum of Numbers in given String is : "+sum);
	}

	public static void main(String[] args){
		String str = "te12ch33no3credit4s";
		SumOfNum sumnum = new SumOfNum();
		sumnum.sumOfStringNum(str);
	}
} 
