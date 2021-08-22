package precilla;

public class ReverseString {
	
	String getReverseString(String input) {
		char output = 0;
		String outputOfReverseString="";
		System.out.println("\nGiven String : "+input);
		System.out.print("Reverse String : ");
		for(int index=input.length()-1;index>=0;index--) {
			output=input.charAt(index);
			outputOfReverseString=Character.toString(output);
			System.out.print(outputOfReverseString);
		}	
		return outputOfReverseString;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseString reverse=new ReverseString();
		reverse.getReverseString("Precilla");
		reverse.getReverseString("TechnoCredits");
	}

}
