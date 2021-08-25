package nidhi;

class Assignment_22{
	int sum=0;
	int countTotalDigits(String str){
		int cnt=0;
		
		for (int i=0;i<str.length();i++){
			if (Character.isDigit(str.charAt(i))){
			cnt++;
			sum += (Character.getNumericValue(str.charAt(i)));
			}
		}
		return cnt;
	}
	
	
	public static void main(String[] arg){
		Assignment_22 assignment22= new Assignment_22();
		String str = "Te1ch2no3cr4ed3it4s";
		System.out.println("Total no. of digits in string are : " + assignment22.countTotalDigits(str));
		System.out.println("Sum of all digits is: " + assignment22.sum);

	}
}