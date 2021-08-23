package margi.Assignment_19;

public class Assignment_19_1 {
	
	//how many words in a given statement
	int processData(String input) {
		int words=1;
		for(int index=0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if(ch==' ') {
				words++;
			}
		}
		return words;
	}
	
	void setData() {
		String input = "Hi Techno Credits Hello";
		System.out.println(processData(input));
	}
	
	public static void main(String[] args) {
		Assignment_19_1 wordCnt = new Assignment_19_1();
		wordCnt.setData();
	}
	
}
