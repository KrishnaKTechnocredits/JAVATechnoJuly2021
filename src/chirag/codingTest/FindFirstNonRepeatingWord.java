package chirag.codingTest;

public class FindFirstNonRepeatingWord {
	
	void nonRepeatingWord(String input) {
		String[] str =input.split(" ");
		boolean flag=false;
		for(int index = 0;index <str.length;index++) {
			for(int innerIndex = index + 1; innerIndex < str.length;innerIndex++) {
				if(str[index].equals(str[innerIndex])) {
					flag = false;
					break;
				}
				else
					flag = true;
			}
			if(flag) {
				System.out.println("First non repeating word from a given String: "+str[index]);
				break;
			}
		}
	}	
	public static void main(String[] args) {
		FindFirstNonRepeatingWord findFirstNonRepeatingWord = new FindFirstNonRepeatingWord();
		String input = "this is hi hello techno credits hello hi chirag this is";
		findFirstNonRepeatingWord.nonRepeatingWord(input);
	}
}