package chirag.assignment24;

public class FindVowelsInAgivenString {
	
	void findVowel(String str) {
		String vowels = "";
		for(int index=0;index < str.length();index++) {
			char ch = str.charAt(index);
			if(ch =='a' || ch =='e'||ch =='i'
					||ch =='o'||ch =='u' ) {
				if(index==str.indexOf(ch)) {
					if(vowels != "")
						vowels = vowels +",";
			vowels = vowels + ch + "";
		}
	}
}
		System.out.println("Vowels in a given String : "+vowels);
}
	
	public static void main(String[] args) {
		FindVowelsInAgivenString findVowelsInAgivenString= new FindVowelsInAgivenString();
		findVowelsInAgivenString.findVowel("technocredits");
	}
}