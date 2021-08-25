package chandani;

public class Assignment22a{
	
	void GetDigitsFromString(String input){
		
		System.out.println("Digits of the String are :" );
		int count = 0;
		for(int index = 0; index < input.length(); index++){
			char ch = input.charAt(index);
			boolean value = Character.isDigit(ch);
			if(value == true){
				System.out.println(ch);
				count ++;
			}
		}
		System.out.println("Count of digits are : " + count);
	}
	
	public static void main(String[] args){
		Assignment22a assignment22a = new Assignment22a();
		assignment22a.GetDigitsFromString("Te1ch2no3cr4ed3it4s");
	}
}
