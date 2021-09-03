package ramkrishna;

public class VowelsCount {

	void getVowelsCount(String str) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			if (str.indexOf(str.charAt(index)) == index) {
				if (str.charAt(index) == 'a' || str.charAt(index) == 'i' || str.charAt(index) == 'e'
						|| str.charAt(index) == 'o' || str.charAt(index) == 'u') {
					System.out.print(str.charAt(index));
					count++;
				}
			}
		}

		System.out.println("\n" + "Numbers Of Vowels count in the given String are:" + count);
   }

	public static void main(String[] args) {
		VowelsCount vowels = new VowelsCount();
		String str = "technocredits";
		vowels.getVowelsCount(str);
	}

}


	

