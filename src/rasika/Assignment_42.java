package rasika;
/*Program 1: Remove multiple occurrence of characters from given string.
input : "technocredits"
output : technordis*/

public class Assignment_42 {
	
	void removeDuplicateCharacters(String string){
		string = string.toLowerCase();
		for(int index = 0; index < string.length(); index++) {
			if(string.indexOf(string.charAt(index)) == index) {
				System.out.print(string.charAt(index));
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Assignment_42 assignment_42 = new Assignment_42();
		assignment_42.removeDuplicateCharacters("Technocredits");
		assignment_42.removeDuplicateCharacters("RasikaNitinMahadik");
	}
}
