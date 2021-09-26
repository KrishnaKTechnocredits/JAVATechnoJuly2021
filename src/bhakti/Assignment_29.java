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
 }*/

package bhakti;

public class Assignment_29 {
	//Program 1 : String Pallindrome by writing reverse method logic.
	
	boolean pallindromeReverse(String str) {
		String reverse ="";
		 
		for (int index= str.length()-1; index>=0; index--) {
			reverse+= str.charAt(index);
		}
		if (str.equals(reverse))
			return true;
		else 
			return false;
	}
	
	
	
	
	//program 2: String Pallindrome by without writing reverse method logic.
	boolean pallindromWithoutReverse(String str) {
		boolean flag=true;
		int ln= str.length();
		for (int x=0, y=ln-1; x<ln/2; x++) {
			if (str.charAt(x)!=str.charAt(y)) {
				flag=false;
			}
			y--;
		}
		if (flag==false)
			return false;
		else 
			return true;
	}	
	// displaymethod 
	void displaysResult (String str) {
		 // reverse string
		 
		if (pallindromeReverse(str)) 
			System.out.println(str+" --> Pallindrome (Byusing revrese string )");
		else	
			System.out.println(str+" --> not Pallindrome (Byusing revrese string )");	
		//WIthout reverseting
		
		 
		if (pallindromWithoutReverse(str)) 
			System.out.println(str+" --> Pallindrome (Logic without reverse string)");
		else	
			System.out.println(str+" --> not Pallindrome (Logic without reverse string)");
		System.out.println("-----------------");
		
	}
	
	public static void main(String[] jj) {
		String str="nna";
		String str1="aabbaa";
		String str2="malayalam";
		
		Assignment_29 obj= new Assignment_29();
		obj.displaysResult(str);
		obj.displaysResult(str1);
		obj.displaysResult(str2);
	}

}
