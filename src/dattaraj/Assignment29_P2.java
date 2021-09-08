package dattaraj;

public class Assignment29_P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment29_P2 pgm2 = new Assignment29_P2();
		String str = "naman";
		
		if(pgm2.isPalindrome(str)) {
			System.out.println(str +" is Palindrome string.");
		}else {
			System.out.println(str +" is not a Palindrome string.");
		}
	}

	 boolean isPalindrome(String str) {
		// TODO Auto-generated method stub
		char ch[]=str.toCharArray();  
		int j = 1;
		char temp = 'y';
		for(int i=0;i<ch.length-1;i++){
			if(ch[i]==ch[ch.length-j]) {
				temp = 'y';
			}else {
				temp = 'n';
				break;
			}
			j++;
		}
		if(temp == 'y') {
			return true;
		}else {
			return false;
		}
	}

}
