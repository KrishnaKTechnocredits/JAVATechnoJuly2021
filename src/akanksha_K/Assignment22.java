package akanksha_K;

public class Assignment22 {
	
	int getStringCount(String input) {
		int count = 0;
		for(int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if(Character.isDigit(ch)) {
				count= count + 1;
			}	
		}
		return count;	
	}
	
	int getStringSum(String input) {
		int sum = 0;
		for(int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if(Character.isDigit(ch)) {
				sum = sum + Integer.parseInt(String.valueOf(ch));
			}	
		}	
		return sum;
	}
	
	public static void main(String args[]) {
		String str1 = "Te1ch2no3cr4ed3it4s";
		String str2 = "Te11ch2no3cr4edi2ts";
		
		Assignment22 assignment22  = new Assignment22();
		
		System.out.println("Number of digits in " + str1+ " are : " + assignment22.getStringCount(str1));
		System.out.println("sum of digits in " + str2+ " are : " + assignment22.getStringSum(str2));
	}
}
