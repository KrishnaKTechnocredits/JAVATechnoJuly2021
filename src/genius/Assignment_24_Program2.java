package genius;

public class Assignment_24_Program2 {
	
	void getMaxFreqOfWords(String input) {
		String repeatedWord = "";
		String temp;
		int count = 0;
		int maxFreq = 0;
		String[] arr = input.split(" ");
		for(int index=0; index<arr.length;index++) {
		    count = 0;
			temp = arr[index];
			for(int index_2 = 0; index_2<arr.length; index_2++) {
				if(temp.equals(arr[index_2]))
					count++;
			}
			
			if(maxFreq<count) {
				maxFreq = count;
				repeatedWord = arr[index];
				
			}
			
		}
		System.out.println(repeatedWord + "->" +maxFreq);
	}

	public static void main(String[] args) {
		String str = "Hi Hello Hi Techno Hello Hi";
		Assignment_24_Program2 assignment_24_Program2 = new Assignment_24_Program2();
		assignment_24_Program2.getMaxFreqOfWords(str);

	}

}
