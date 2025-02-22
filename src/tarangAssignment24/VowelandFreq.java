package tarangAssignment24;

public class VowelandFreq {
	
	void countVowel(String input) {
		input = input.toLowerCase();
		String vowels="";
		
		for (int index =0; index< input.length(); index++) {
			char ch= input.charAt(index);
			if(index == input.indexOf(ch)) {
				
			    if(ch=='a' || ch == 'e' || ch== 'i' || ch=='o' || ch == 'u') 	    
			    	vowels+=ch;	    	
			}
		}
		System.out.println("Vowels are in string -->" +vowels);
	}
	void getWordsfreq(String input) {
		int count=0, countmax=0;
		String[] arr = input.split(" ");
		String maxRepeatWord = "",temp;
		for(int index=0; index<arr.length; index++) {
			count = 0;
			temp = arr[index];
			for(int index1=0; index1<arr.length; index1++) {
				if(temp.equals(arr[index1]))
					count++;
			}
			if(countmax<count) {
					countmax = count;
					maxRepeatWord = arr[index];	
			}
		}
		System.out.println(maxRepeatWord + "--> " + countmax);
	}
	public static void main (String[] args) {
		VowelandFreq vowelandfreq= new VowelandFreq();
		String input="Hi Hello Technocredits Hi hello Hi  Hello hello"; 
		vowelandfreq.countVowel(input);
		System.out.println("Words Frequency is");
		vowelandfreq.getWordsfreq(input);

	}
}
