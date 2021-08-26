package dattaraj;

public class Assignment_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_22 assign22= new Assignment_22();
		String str = "Te1ch2no3cr4ed3it4s";
		System.out.println("Number of digits in given string are :"+assign22.getDigitCnt(str));
	}

	 int getDigitCnt(String str) {
		// TODO Auto-generated method stub
		int cnt=0;
		for (int i = 0; i < str.length(); i++) {
			if(Character.isDigit(str.charAt(i))) {
				cnt++;
			}
		}
		return cnt;
	}

}
