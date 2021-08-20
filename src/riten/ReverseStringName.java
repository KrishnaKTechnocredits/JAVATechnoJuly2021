package riten;

class ReverseStringName{
	
	String revString(String input){
		
		
		for(int index=input.length()-1;index>=0;index--){
			
			System.out.print(input.charAt(index));
				
			}
		return input;
		}
		
	public static void main(String[] args){
		ReverseStringName reversestring = new ReverseStringName();
		System.out.print("reverse string is: ");
			reversestring.revString("technocredits");
		
		
	}
}