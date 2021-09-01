package dattaraj;

public class Assignment_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_24 assign24= new Assignment_24();
		String str = "technocredits";
		
		assign24.vowel_Cnt(str);
		
	}
	void vowel_Cnt(String s) {
		String vowel = "";
		
		for (int index = 0; index < s.length(); index++) {
			char ch = s.charAt(index);
			switch (ch) {
			case 'a':
			case 'A':
			case 'e':
			case 'E':
			case 'i':
			case 'I':
			case 'o':
			case 'O':
			case 'u':
			case 'U':
				if (vowel.indexOf(s.charAt(index)) == -1)
					vowel += s.charAt(index) + " ";
				break;
			}
		}
		System.out.println("Vowels are : " + vowel);
	}
}
