package chirag.assignment24;

public class MaxRepeatingWordINaString {
	
	void MaxRepeatingWord(String input) {
		String [] str = input.split(" ");
		int count = 0;
		String max="";
		for(int index = 0; index < input.length();index++) {
			int individualCount = 1;
			for(int j=index +1; j < str.length;j++) {
				if(str[j].equals(str[index])) {
				individualCount++;
			}
		}
		if(count < individualCount) {
			count = individualCount;
			max = str[index];
		}
		}
		System.out.println("Maximum repeated word in a given string is '" + max+ "',repeated for "+count+" times.");
	}
	public static void main(String[] args) {
		MaxRepeatingWordINaString maxRepeatingWordINaString = new MaxRepeatingWordINaString();
		maxRepeatingWordINaString.MaxRepeatingWord("Hi Hello Hi Hello Hi");
	}

}
