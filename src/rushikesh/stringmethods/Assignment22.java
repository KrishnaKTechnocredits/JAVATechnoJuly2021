package rushikesh.stringmethods;

public class Assignment22 {
	int getDigits(String str1) {
		int count = 0;
 		for(int index=0;index<str1.length();index++) {
			char ch=' ';
			ch= str1.charAt(index);
			if(Character.isDigit(ch))
				count++;
		}
		return count;
	}
	int getSumOfString(String str2) {
		int sum = 0;
 		for(int index=0;index<str2.length();index++) {
			char ch=' ';
			ch= str2.charAt(index);
			if(Character.isDigit(ch))
			{
				sum = sum + Character.getNumericValue(ch);;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		Assignment22 assignment22 = new Assignment22();
		String str1 = "Te1ch2no3cr4ed3it4s";
		String str2 = "Te11ch2no3cr4edi2ts";
		int count=assignment22.getDigits(str1);
		int sum=assignment22.getSumOfString(str2);
		System.out.println("The number of digits in gien string is "+count);  
		System.out.println("The sum of digits in gien string is "+sum); 
	}
}
