/* Assignment - 24 : 28th Aug'2021
Program 1: Java Program to Count the Number of Vowels in user defined string.
Input : technocredits
output : vowels are e , o, i 

Program 2 : Max repeating word with its freq.
input : Hi Hello Hi Techno Hello Hi
output : Hi -> 3 */

package chandani.Assignment_24;

class Assignment24a{
		
		void getVowelsCount(String str){
				
				System.out.println("Vowels in the given String are : ");
				int count = 0;
				for (int index = 0; index < str.length(); index++){
					if (str.indexOf(str.charAt(index)) == index) {
						if (str.charAt(index) == 'a' || str.charAt(index) == 'i' || str.charAt(index) == 'e' || str.charAt(index) == 'o' || str.charAt(index) == 'u') {
							System.out.println(str.charAt(index));
							count ++ ;
						}
					}
				}
			System.out.println("\n" + "Count of vowels in the given string is :" + count);	
		}
		
		
		public static void main(String[] args){
			Assignment24a vowels = new Assignment24a();
			String str = "technocredits";
			vowels.getVowelsCount(str);		
		}
}