/*Assignment - 24 : Program 1: Java Program to Count the Number of Vowels in user defined string.
Input : technocredits
output : vowels are e , o, i */
package santosh;
class VowelCounts{
        void getVowelsCount(String str){

				System.out.println(" The given String technocredits Numbers Of Vowels count is  : ");
				int count = 0;
				for (int index = 0; index < str.length(); index++){
					if (str.indexOf(str.charAt(index)) == index) {
						if (str.charAt(index) == 'a' || str.charAt(index) == 'i' || str.charAt(index) == 'e' || str.charAt(index) == 'o' || str.charAt(index) == 'u') {
							System.out.print(str.charAt(index));
							count ++ ;
						}
					}
				}
			System.out.println("\n ---------------------------------------------------------------");
			System.out.println("\n" + "Numbers Of Vowels count in the given String are:" + count);	
		    System.out.println("-----------------------------------------------------------------");
		}
		public static void main(String[] args){
			VowelCounts vowels = new VowelCounts();
			String str = "technocredits";
			System.out.println("-------------------------------------------------------------");
			vowels.getVowelsCount(str);		
		}
} 

