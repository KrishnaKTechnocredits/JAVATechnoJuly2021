package purshottamJoshi;

class Assignment22_2{
	
	static int sumOfString(String str){
		int sum = 0;
		for(int index=0; index < str.length(); index++){
			if(Character.isDigit(str.charAt(index))){
				sum = sum + Integer.parseInt(str.charAt(index) + "");

			}
		}
		return sum;
	}
	
	public static void main(String[] args){
		String temp = "Te11ch2no3cr4edi2ts";
		System.out.println("Sum of digits in a string : "+Assignment22_2.sumOfString(temp));
	}
}