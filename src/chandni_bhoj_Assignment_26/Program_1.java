	/*Assignment - 26 : 1st Sep'2021

	Program : 1 
	WAP to print Reverse a given String.
	input : This is technocredits
	output : stiderconhcet si sihT  

	Program : 2 
	reverse given string array.
	input : {"Credits", "Techno","From","Diwali","Happy"}
	output : {"Happy","Diwali","From","Techno","Credits"}

	Program : 3 
	swap 2 numbers with using 3rd variable

	Program : 4 
	swap 2 numbers without using 3rd variable8*/

	package chandni_bhoj_Assignment_26;

	public class Program_1 {
		
		void getReverseString (String input) {
			String output = "";
			for (int index = input.length() - 1; index >= 0; index--){
			output += input.charAt(index);
			}
			System.out.println (output);
		}
		
		public static void main(String[] args) {
			new Program_1().getReverseString("This is technocredits");
		}

}
