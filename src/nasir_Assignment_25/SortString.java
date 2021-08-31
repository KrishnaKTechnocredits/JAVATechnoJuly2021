package nasir_Assignment_25;

public class SortString {
	void stringOrder(String input) {
		String digit="";
		String upperCase="";
		String lowerCase="";

		for(int index=0;index<input.length();index++) {
			if(Character.isDigit(input.charAt(index))) {
				digit+=input.charAt(index);

			}
			else if(Character.isUpperCase(input.charAt(index))) {
				upperCase+=input.charAt(index);
			}
			else if (Character.isLowerCase(input.charAt(index))){
				lowerCase+=input.charAt(index);
			}
		}
	System.out.println("Output: "+upperCase+digit+lowerCase);
	}
	public static void main(String[] args) {
		SortString sortString=new SortString();
		sortString.stringOrder("Ma1U2liK");

	}

}
