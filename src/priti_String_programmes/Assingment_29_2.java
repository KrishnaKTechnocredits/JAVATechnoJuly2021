package priti_String_programmes;

public class Assingment_29_2 {
	/*program 1: String Pallindrome by without writing reverse method logic.
	String input = "malayylam";
	*/
	
	boolean isPallindrome(String input) {
		boolean flag= true;
		for (int index=0;index<input.length();index++){
			if(input.charAt(index)== input.charAt((input.length()-1)-index)) {
			flag=true;
			}else {
			flag= false;
			break;
			}
		}
		return flag;
	}			
		
	void dislayResult(String input) {
		if(isPallindrome(input))
			System.out.println(input + " is pallindrome");
		else
			System.out.println(input + " is not a pallindrome");
		
	}
	
	public static void main(String[] a) {
		System.out.println("For odd length string");
		String input = "malayalam";
		Assingment_29_2 assingment_29_2= new Assingment_29_2();
		assingment_29_2.dislayResult(input);
		String input1 = "malayylam";
		assingment_29_2.dislayResult(input1);
	}
}	

