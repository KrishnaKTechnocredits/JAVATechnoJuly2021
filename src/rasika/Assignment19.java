//Get the total words in a string.
package rasika;

public class Assignment19 {

	int cnt = 0;
	int countWords(String input) {
		for(int index = 0; index < input.length(); index++) {
			if(input.charAt(index) == ' ') {
				cnt++;
			}
		}
		return cnt +1;
	}
	public static void main(String[] args) {
		Assignment19 assignment19 = new Assignment19();
		String array = "Hi Techno Credits Hello";
		//array.replace(",", " ").replace(".", " "); To replace all other symbols with blank space.
		System.out.println("The total words in a string are "+ assignment19.countWords(array));
	}
}
