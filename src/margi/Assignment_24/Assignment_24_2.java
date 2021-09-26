package margi.Assignment_24;

public class Assignment_24_2 {

	//Max repeating word with its freq
	void getMaxRepeatingWord(String input) {
		String[] arr = input.split(" ");
		int maxFreq=0;
		int count=0;
		String repeatWord = "", temp;
		for(int index=0; index < arr.length; index++) {
			count=0;
			temp = arr[index];
			for(int index_1 = 0; index_1 < arr.length; index_1++) {
				if(temp.equals(arr[index_1]))
					count++;
			}
			if(maxFreq < count) {
				maxFreq = count;
				repeatWord = arr[index];
			}
		}
		System.out.println(repeatWord + " -> " + maxFreq);
	}
	
	public static void main(String[] args) {
		Assignment_24_2 assignment_24_2 = new Assignment_24_2();
		String input = "Hi Hello Hi Techno Hello Hi";
		assignment_24_2.getMaxRepeatingWord(input);
	}
}
