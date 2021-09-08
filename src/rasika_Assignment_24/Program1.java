package rasika_Assignment_24;

/*Input : technocredits
output : vowels are e , o, i (vowels in string)*/

public class Program1 {
	
	void getVowels(String input) {
		for(int index = 0; index < input.length(); index++) {
			if(input.charAt(index) == 'a' || input.charAt(index) == 'e' || input.charAt(index) == 'i' || input.charAt(index) == 'o' ||input.charAt(index) == 'u') {
				if(index == input.indexOf(input.charAt(index)))
					System.out.println(input.charAt(index));
			}
		}
	}

	public static void main(String[] args) {
		Program1 program1 = new Program1();
		program1.getVowels("technocredits");
	}
}
