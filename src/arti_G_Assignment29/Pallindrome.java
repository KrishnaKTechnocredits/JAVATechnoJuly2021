package arti_G_Assignment29;
/*Assignment - 29 : 7th Sep'2021

Program 1 : String Pallindrome by writing reverse method logic.
String input = "naman";

program 2: String Pallindrome by without writing reverse method logic.
String input = "naman";
String input = "aabbaa";*/

public class Pallindrome {

	boolean isPallindrome(String input) {
		boolean flag=false;
		String output="";
		for(int index=input.length()-1;index>=0;index--) {
			output = output+input.charAt(index);
			if(input.equalsIgnoreCase(output)) {
				flag=true;
			}
			else {
				flag=false;
			}
			}
		if(flag) {
			System.out.println(input +" is Pallindrome");
		}
		else {
			System.out.println(input + "is not a Pallindrome");
		}
		return flag;
	}
	
	boolean isPallindomeWithoutReverse(String input){
		boolean flag=false;
		String output="";
		for(int index=0;index<input.length();index++){
			if(input.charAt(index)==input.charAt((input.length()-1)-index)){
				flag=true;
			}else{
				flag=false;
			}
		}
		if(flag){
			System.out.println(input + " is pallindrome");
		}else{
			System.out.println(input + " is not a pallindrome");
		}
		return flag;	
	}
	public static void main(String[] args) {
		Pallindrome pallindrome = new Pallindrome();
		System.out.println("Pallindrome string by writing reverse method logic "+pallindrome.isPallindrome("naman"));
		System.out.println("Pallindrome string by without writing reverse method logic "+ pallindrome.isPallindomeWithoutReverse("aabbaa"));
		System.out.println("Pallindrome string by without writing reverse method logic "+ pallindrome.isPallindomeWithoutReverse("naman"));

	}
}
