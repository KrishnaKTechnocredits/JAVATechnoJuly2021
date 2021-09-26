package suchita;


//import java.util.Arrays;

class Assignment24 {
		
		// find the number of vowels in given string
		
		String getCountNumberOfVowels(String arr) {
			int count = 0;
			String character = "";
			for(int index=0;index<arr.length();index++) {
				
				char ch = arr.charAt(index); 
				if(index == arr.indexOf(ch)) {
					if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
					character += String.valueOf(ch) + " ";
					count++;
				}
				}	
				
			}
			System.out.println("Count of vowels :: " + count);
			return character;
			
		}
		
		
		
		// find the maximum repeated word in the given array
		
		void getMaxRepeatingWord(String str) {
			
			String[] input = str.split(" ");
			String output = "";
			int max=0;
			String character = "";
			
			for(int index=0;index<input.length;index++) {
				int count=1;
				for (int j = index + 1; j < input.length; j++) {
					if (input[index].equalsIgnoreCase(input[j])) {
					count++;
				}
				if (count > max) {
					max = count;
					character = input[j];
				}
				}	
			}
		
		System.out.println( "\n " + character + " : " + max );
			
		}
		
		public static void main(String[] args) {
			
			Assignment24 assignment = new Assignment24();
			String input = "technocredits";
			String output = assignment.getCountNumberOfVowels(input);
			System.out.println("Vowels are :: " + output);
			String input2 = "Hi Hello Hi Techno Hello Hi";
			 assignment.getMaxRepeatingWord(input2);
			//System.out.println(output2)
		}
		
}

