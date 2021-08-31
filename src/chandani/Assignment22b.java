package chandani;

public class Assignment22b{
	
	 void getSumOfDigitsFromString(String input){
		 
		System.out.println("Digits of the String are :" );
		int sum = 0;
		for(int index = 0; index < input.length(); index++){
			char ch = input.charAt(index);
			boolean value = Character.isDigit(ch);
			if(value == true) {
				System.out.println(ch);
				sum += Character.getNumericValue(ch);
			}
		}
		System.out.println("Sum of the digits of the string is : " + sum);
	}
	
	public static void main(String[] args){
		Assignment22b assignment22b = new Assignment22b();
		assignment22b.getSumOfDigitsFromString("Te11ch2no3cr4di2ts");
	}
}
