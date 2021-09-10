package dattaraj;

public class Assignment29_P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment29_P1 pgm1 = new Assignment29_P1();
		String str = "naman";
		
		if(pgm1.isPalindrome(str)) {
			System.out.println(str +" is Palindrome string.");
		}else {
			System.out.println(str +" is not a Palindrome string.");
		}

	}

	 boolean isPalindrome(String str) {
		// TODO Auto-generated method stub
		char ch[]=str.toCharArray();  
		String rev="";  
		for(int i=ch.length-1;i>=0;i--){  
		   rev+=ch[i];  
		}
		if(str.equals(rev)) {
			return true;
		}else {
			return false;
		}
	 }

}
