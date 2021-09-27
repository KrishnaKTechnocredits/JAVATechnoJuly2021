package suchita;

//Assignment 37

// WAP to find a second largest word

class Assignment37 {

		void getSecondLargestWord(String input) {
			
			String str[] = input.split(" ");
			String str2 = "";
			String output = "";
			int temp = 0;
			
			System.out.println("Given String :: " + input);
			for(int index=0;index<str.length;index++) {
				
				if(str2.length() < str[index].length()) {
					str2 = str[index];
					temp = index;
				}
			}
			str[temp] = "";
			for(int index=0;index<str.length;index++) {
			
				if(output.length() < str[index].length()) {
					output = str[index];
				}
			}
			System.out.println("The second largest word :: " + output);
			
		}
		
		public static void main(String[] args) {
			
			Assignment37 assignment = new Assignment37();
			String input = "Welcome to the family";
			assignment.getSecondLargestWord(input);
		}
}