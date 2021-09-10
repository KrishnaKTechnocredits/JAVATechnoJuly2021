package chandani.Assignment_30;

public class Assignment30c {
 
	int rno;
	int isPalindrome(int num){
			
			int r;
			while(num > 0){
					r = num % 10;
				    rno = rno * 10 + r;
					num = num / 10;
			}
			System.out.println("Reverse of given number is : " + rno);
			return rno;
		}

		void displayPallindromeResult(int num){
			if(num == isPalindrome(num)){
				System.out.println(num + " is palindrome");
			}else
				System.out.println(num + " is not a palindrome");
		 }
		 
		public static void main (String[] args){
			Assignment30c assignment30c = new Assignment30c();
			assignment30c.displayPallindromeResult(12321);
			
			Assignment30c assignment30c1 = new Assignment30c();
			assignment30c1.displayPallindromeResult(121);
			
			Assignment30c assignment30c2 = new Assignment30c();
			assignment30c2.displayPallindromeResult(1232);
		}
}

