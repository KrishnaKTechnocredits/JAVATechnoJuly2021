package trupti;

public class Assignment_25_1 {
	
	public static void main(String[] args) {
		Assignment_25_1 sumDigit=new Assignment_25_1();
		String str="te12ch33no3credi4s";
		System.out.println("sum of digit: "+sumDigit.getSum(str));
			
	}
	
	int getSum(String str) {
		int sum=0;
		String temp="0";
		for(int index=0; index<str.length(); index++) {
			char ch=str.charAt(index);
			if(Character.isDigit(ch)) {
				temp+=ch;
			}else {
				sum+=Integer.parseInt(temp);
				temp="0";
			}
		}
		return sum;
	}
}

