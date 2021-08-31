package rushikesh.stringmethods;

public class SumAsString {
	void getStringAsNum(String str) {
		
		int twoDigit = 0;
		int singleDigit = 0;
		for(int index=0;index<str.length();index++) {
			char ch=str.charAt(index);
			if(Character.isDigit(ch) && Character.isDigit(str.charAt(index+1))) {
				String num = "";
				num = num + ch + str.charAt(index + 1);
				twoDigit = twoDigit + Integer.parseInt(num);
			}else if(Character.isDigit(ch) && Character.isLetter(str.charAt(index - 1))) {
				singleDigit = singleDigit + Character.getNumericValue(ch);
			}
		}
		int sum = singleDigit + twoDigit;
		System.out.println("Sum of numbers in given String " + str + " : " + sum);
	}
	public static void main(String[] args) {
		SumAsString sumAsString=new SumAsString();
		String str = "te12ch33no3credit4s";
		sumAsString.getStringAsNum(str);
	}
}
/*String str = "te12ch33no3credit4s"; 
output = 12+33+3+4
*/