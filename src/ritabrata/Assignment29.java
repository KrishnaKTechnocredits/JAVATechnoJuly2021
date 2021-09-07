/*Assignment - 29 : 7th Sep'2021
 
 Program 1 : String Pallindrome by writing reverse method logic.
 String input = "naman";
 
 program 2: String Pallindrome by without writing reverse method logic.
 String input = "naman";
 String input = "aabbaa";
 
 String input = "malayalam";
 boolean isPallindrome(String input){
 
 }
 
 void displayPallindromeResult(String input){
	if(isPallindrome(input))
			sop(input + " is pallindrome");
		else
			sop(input + " is not a pallindrome");
 }
 
 main(){
		String input = "madam";
		test.displayPallindromeResult(input);
 }
 
 (optional)program 3 : given number is pallindrome or not, without converting it input into String?
 int num = 12321;
 ans : true
 
 Hint : % and /
 */

package ritabrata;

public class Assignment29 {
	void getPalindromeReverse(String input) {
		String reverse="";
		for(int index=input.length()-1;index>=0;index--) {
			reverse= reverse+ input.charAt(index);
		}
		if(input.equalsIgnoreCase(reverse))
			System.out.println("The input string: "+input+" is not palindrome");	
	}
	
	void getPalindromeWithoutReverse(String input) {
		boolean flag=false;
		for(int index=0;index<input.length();index++){
			if(input.charAt(index)==input.charAt((input.length()-1)-index)){
				flag=true;
			}else{
				flag=false;
			}
		}
		if(flag){
			System.out.println("The input string: "+input+" is palindrome");	
		}else{
			System.out.println("The input string: "+input+" is not palindrome");	
		}
		
		
	}

	public static void main(String[] args) {
		Assignment29 palindrome=new Assignment29();
		String a="naman";
		palindrome.getPalindromeReverse(a);
		System.out.println("------------------------------------");
		String input1 = "naman";
		String input2 = "aabbaa";
		String input3 = "malayalam";
		palindrome.getPalindromeWithoutReverse(input1);
		palindrome.getPalindromeWithoutReverse(input2);
		palindrome.getPalindromeWithoutReverse(input3);

	}

}
