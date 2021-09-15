package Sourabh_Assignment_24;

public class MaxWordFreq {

	void findMaximumFreqWord(String str) {
		String[] input = str.split(" ");

		int maxFreqCount = 0;
		String maxRepeatedWord = "";
		String temp = "";

		for (int index = 0; index < input.length; index++) {
			temp =  input[index];
			int freqCount = 0;

				for (int innerindex = 0; innerindex < input.length; innerindex++) {
					if (input[innerindex].equals(temp)) {
						freqCount++;
					}
				}
				if(maxFreqCount < freqCount) {
					maxFreqCount = freqCount;
					maxRepeatedWord = input[index];
				}
		}
		System.out.println("\""+maxRepeatedWord+"\" word is mximum times repeated in given String.");
		System.out.println("Frequency of "+maxRepeatedWord+" in given String is : "+maxFreqCount);
	}
	public static void main(String[] args) {
		String str = "Hi Hello Hi Techno Hello Hi";
		MaxWordFreq maxfreq = new MaxWordFreq();
		maxfreq.findMaximumFreqWord(str);
	}

}
