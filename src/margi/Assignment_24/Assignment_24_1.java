package margi.Assignment_24;

public class Assignment_24_1 {

	static int count=0;
	//Count the Number of Vowels in user defined string
	void getVowels(String input) {
		String str = "";
		for(int index=0; index < input.length(); index++) {
			if(index==input.indexOf(input.charAt(index))) {
				switch(input.charAt(index)) {
					case 'a': str += "a";
							count++;
							break;
					case 'e': str += "e";
							count++;
							break;
					case 'i': str += "i";
							count++;
							break;
					case 'o': str += "o";
							count++;
							break;
					case 'u': str += "u";
							count++;
							break;
				}
			}
		}
		System.out.println("Total vowels are: " + count + "\nVowels are: " + str);
	}
	
	public static void main(String[] args) {
		Assignment_24_1 assignment_24_1 = new Assignment_24_1();
		String input = "technocredits";
		assignment_24_1.getVowels(input);
	}
}
