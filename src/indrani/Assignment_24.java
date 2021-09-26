
package indrani;

public class Assignment_24 {
	String vowels = "";
	
	void getVowelCountFromString(String str) {
		
		for(int index=0;index < str.length();index++) {
			char ch = str.charAt(index);
			if(ch =='a'||ch =='e'||ch =='i'||ch =='o'||ch =='u'||ch =='A'||ch =='E'||ch =='I'
					||ch =='O'||ch =='U' ) {
				vowels=String.valueOf(ch);
				System.out.println("Vowels in a given String : "+vowels);
		}
	}
}
	int getMaxRepeatingWordCount(String str) {
		String word = "";
		int maxcount=0;
		String[] data = str.split(" ");
		for (int index = 0 ; index < data.length ; index++) {
			int count = 0;
			word = data[index];
	       for(int index2=0 ; index2 < data.length ; index2++) {
	    	   if(word.equals(data[index2])) {
	    		   count++;
	    	   }
	    	   if(maxcount<count)
	    		   maxcount=count;
	       }
	}
		System.out.println("Frequency of the maximum repeated word : " +maxcount);
		return maxcount;
	}
	public static void main(String[] args) {
		Assignment_24 vowel = new Assignment_24();
		vowel.getVowelCountFromString("TEchnocredIts");
		vowel.getMaxRepeatingWordCount("Hi Hello Hi Techno Hello Hi");

	}
}
