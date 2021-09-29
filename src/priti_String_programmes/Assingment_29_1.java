package priti_String_programmes;

public class Assingment_29_1 {
	/*Program 1 : String Pallindrome by writing reverse method logic.
	String input = "naman";*/
	void findStringPallindrome(String str) {
		String output="";
		for (int index=str.length()-1;index>=0;index--) {
			output= output+str.charAt(index)+"";
		}
		if (str.equals(output)){
			System.out.println("Given String "+str+" is Pallindrome.");
		}
	}
	
	public static void main(String[] a) {
		Assingment_29_1 assingment_29 = new Assingment_29_1();
		String input= "naman";
		assingment_29.findStringPallindrome(input);
		
	}
}



